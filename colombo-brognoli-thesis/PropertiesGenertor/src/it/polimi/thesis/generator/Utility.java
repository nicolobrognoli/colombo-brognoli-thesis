package it.polimi.thesis.generator;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Utility {
	
	public static Map<String, State> processPrismModel(String modelFile){
		Map<String, State> statesList = new HashMap<String, State>();
		
		int numberStates, i, nState,j,calculatedValues,k;
		String nameReward;
		List<String> rewardNames = new ArrayList<String>();
		Runtime r = Runtime.getRuntime();
		int numberOfRewards;
		String[] values;
		
		System.out.println(modelFile);
		try {
			Process p = r.exec("prism "+modelFile);
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String inputLine=in.readLine();
			String output = "", states = "", temp = "";
			while ((inputLine != null)) {
				output+= inputLine;
				if(inputLine.contains("States")){
					states=inputLine;
				}
				inputLine=in.readLine();
			}
			in.close();
			//get number of states
			temp = states.substring(states.indexOf(":")+1).trim();
			temp = temp.substring(0, temp.indexOf('(') - 1);
			numberStates=Integer.parseInt(temp);
			
			//get the rewards name from model file
			rewardNames = Utility.getRewardNames(modelFile);
			numberOfRewards = rewardNames.size();
			
			calculatedValues=numberStates*numberOfRewards*2;
			values=new String[calculatedValues];
			System.out.println("Stati "+numberStates);			
			
		    OutputStream fos = new FileOutputStream("properties.props");
			PrintStream print = new PrintStream(fos);
			for(j=0;j<numberOfRewards;j++){
				nameReward = rewardNames.get(j);
				for(i=0;i<numberStates;i++){
					print.append("R{\""+nameReward+"\"}max=? [F \"final\" {s="+i+"}]");
					print.append("\n\n");
					print.append("R{\""+nameReward+"\"}min=? [F \"final\" {s="+i+"}]");
					print.append("\n\n");
				}
			}
			fos.close();
			print.close();
			
			p = r.exec("prism "+modelFile+" properties.props");
			in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			inputLine=in.readLine();
			i=0;
			while ((inputLine != null)) {
				System.out.println(inputLine);
				if(inputLine.contains("Value in the filter state:")){
					values[i]=inputLine;
					i++;
				}
				output+= inputLine;
				inputLine=in.readLine();
			}
			in.close();
			
			//initialize the set of states
			for(i=0;i<numberStates;i++){
				State state = new State(i, rewardNames);
				//add the the state to the list
				statesList.put(i+"", state);
			}
			
			State stateTemp;
			float[] numberValues=new float[calculatedValues];
			for(j=0,i=0;j<numberOfRewards;j++){
				nameReward = rewardNames.get(j);
				for(k=0,nState=0; k<numberStates; i++, nState++,k++){
					stateTemp = statesList.get(nState+"");
					numberValues[i]=Float.parseFloat(values[i].substring(values[i].indexOf(":")+2));
					stateTemp.addMaxReward(nameReward, numberValues[i]);
					System.out.println(nameReward+" Max stato "+nState+": "+numberValues[i]);				
					i++;
					numberValues[i]=Float.parseFloat(values[i].substring(values[i].indexOf(":")+2));
					System.out.println(nameReward+" Min stato "+nState+": "+numberValues[i]);	
					stateTemp.addMinReward(nameReward, numberValues[i]);
				}
			}
			
			//get reward value for each state
			FileInputStream fstream = new FileInputStream(modelFile);
			DataInputStream inStream = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
			String strLine, rewName, value, state;
		
			while ((strLine = br.readLine()) != null)   {
				if(strLine.contains("rewards") && !strLine.equals("endrewards"))
				{
					strLine = strLine.substring(strLine.indexOf('"')+1);
					rewName = strLine.substring(0, strLine.indexOf('"'));
					strLine = br.readLine();
					
					if(strLine.contains("true"))
					{
						//all the states have the same value
						strLine = strLine.substring(strLine.indexOf(':')+1, strLine.indexOf(';'));
						value = strLine.trim();
						for(i =0; i<numberStates; i++){
							stateTemp = statesList.get(i+"");
							stateTemp.addStateReward(rewName, Float.parseFloat(value));
						}
					}
					else
					{
						//read value for each state
						do{
							state = strLine.substring(strLine.indexOf('=')+1, strLine.indexOf(':'));
							state = state.trim();						
							strLine = strLine.substring(strLine.indexOf(':')+1, strLine.indexOf(';'));
							value = strLine.trim();
							//add the state reward value
							stateTemp = statesList.get(state);
							stateTemp.addStateReward(rewName, Float.parseFloat(value));
							strLine = br.readLine();
						}while (!strLine.contains("endrewards")); 
					}
					
				}
			}
			in.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return statesList;
	}

	public static List<String> getRewardNames(String modelFile) {
		List<String> names = new ArrayList<String>();
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(modelFile));
			String str;
		    while ((str = in.readLine()) != null) {
		        if(str.contains("rewards") && !str.contains("endrewards"))
		        {
		        	str = str.substring(str.indexOf('"')+1);
		        	str = str.substring(0, str.indexOf('"'));
		        	names.add(str);
		        }
		    }
		    in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	    
		return names;		
	}
	
	public static List<String> getInterfacesName(String bindingFile){
		List<String> interfacesList = new ArrayList<String>();
		try {
			File file = new File(bindingFile);
		    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);			
			doc.getDocumentElement().normalize();
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			//retrieve information about alternative
			NodeList intefaceNodeList = doc.getElementsByTagName("interface");
			System.out.println("Information of all interfaces");
	
			for (int s = 0; s < intefaceNodeList.getLength(); s++) {
	
				Node interfaceNode = intefaceNodeList.item(s);
			    
			    if (interfaceNode.getNodeType() == Node.ELEMENT_NODE) {
			  
			          Element interfc = (Element) interfaceNode;
				      NodeList interfaceName = interfc.getElementsByTagName("name");
				      Element nameElement = (Element) interfaceName.item(0);
				      NodeList name = nameElement.getChildNodes();
				      System.out.println("Interface Name : "  + ((Node) name.item(0)).getNodeValue());
				      String iName = ((Node) name.item(0)).getNodeValue();
				      interfacesList.add(iName);			      			      
			    }			    
			}		
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return interfacesList;
	}
	
	public static List<Reward> processXMLModel(String bindingFile, Map<String, State> statesList, 
						List<String> interfacesList){
		
		List<Reward> rewardsList=new ArrayList<Reward>();
		try {
			File file = new File(bindingFile);
		    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();		
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			//retrieve information about alternative
			NodeList intefaceNodeList = doc.getElementsByTagName("interface");
			System.out.println("Information of all interfaces");
	
			for (int s = 0; s < intefaceNodeList.getLength(); s++) {
	
				Node interfaceNode = intefaceNodeList.item(s);
			    if (interfaceNode.getNodeType() == Node.ELEMENT_NODE) {
			  
			          Element interfc = (Element) interfaceNode;
				      NodeList interfaceName = interfc.getElementsByTagName("name");
				      Element nameElement = (Element) interfaceName.item(0);
				      NodeList name = nameElement.getChildNodes();
				      System.out.println("Interface Name : "  + ((Node) name.item(0)).getNodeValue());
				      String iName = ((Node) name.item(0)).getNodeValue();
				      interfacesList.add(iName);
				      //getting the referred class				      
				      NodeList classList = interfc.getElementsByTagName("class");

				      for (int i = 0; i < classList.getLength(); i++)
				      {
				    	  Node classNode = classList.item(i);
				    	  //get attribute optional
					      boolean optional=false;
					      NamedNodeMap tempAttributeMap=classNode.getAttributes();
						  if(tempAttributeMap.getLength()>0){
							  Node temp=tempAttributeMap.item(0);
							  temp.getNodeValue();
							  if(temp.getNodeName().equals("type")&&temp.getNodeValue().equals("optional")){
								  optional=true;
							  }
						  }	
				    	  //get the class name
				    	  Element classElm = (Element) classNode;
					      NodeList className = classElm.getElementsByTagName("name");
					      nameElement = (Element) className.item(0);
					      name = nameElement.getChildNodes();					     
					      String cName = ((Node) name.item(0)).getNodeValue();
					      System.out.print("Class Name : "  + cName + " - ");
					      //get the state
					      Element stateElm = (Element) classNode;
					      NodeList stateName = stateElm.getElementsByTagName("state");
					      nameElement = (Element) stateName.item(0);
					      name = nameElement.getChildNodes();
					      System.out.println("State : "  + ((Node) name.item(0)).getNodeValue());
					      String numState = ((Node) name.item(0)).getNodeValue();		
					      State incompleteState = statesList.get(numState);
					      if(optional)
					    	  incompleteState.setOptional(true);
					      incompleteState.setInterfaceName(iName);
					      incompleteState.setClassName(cName);
				      }				      
			    }			    
			  }
			//getting total amount of rewards
			NodeList totalRewardsNodeList = doc.getElementsByTagName("totalReward");
			System.out.println("Buiding total Rewards...");
			for(int s = 0; s < totalRewardsNodeList.getLength(); s++){				
				Node totalRewardsNode = totalRewardsNodeList.item(s);
				if (totalRewardsNode.getNodeType() == Node.ELEMENT_NODE) {
					Element totalRewardsElement = (Element) totalRewardsNodeList.item(s);
					Node rewardNode=totalRewardsElement.getFirstChild();
					while(rewardNode!=null){
						NodeList rewardNodeList=totalRewardsElement.getElementsByTagName(rewardNode.getNodeName());
						Node rewardItemNode=rewardNodeList.item(0);
						NodeList rewardChildList=rewardItemNode.getChildNodes();
						System.out.println("Name Reward "+rewardNode.getNodeName()+" Value reward: "+ rewardChildList.item(0).getNodeValue());
						Reward tempReward=new Reward(rewardNode.getNodeName(),new Float(rewardChildList.item(0).getNodeValue()));
						rewardsList.add(tempReward);
						rewardNode=rewardNode.getNextSibling();
					}					
				}     
			}
			//getting rewards weight
			NodeList weightNodeList = doc.getElementsByTagName("weight");
			System.out.println("Getting Rewards weight...");
			int rewardIndex;
			for(int s = 0; s < weightNodeList.getLength(); s++){				
				Node weightNode = weightNodeList.item(s);
				if (weightNode.getNodeType() == Node.ELEMENT_NODE) {
					Element weightElement = (Element) weightNodeList.item(s);
					Node rewardWeightNode=weightElement.getFirstChild();
					while(rewardWeightNode!=null){
						NodeList weightList=weightElement.getElementsByTagName(rewardWeightNode.getNodeName());
						Node weightItemNode=weightList.item(0);
						NodeList weightChildList=weightItemNode.getChildNodes();
						System.out.println("Name Reward "+rewardWeightNode.getNodeName()+" Weight: "+ weightChildList.item(0).getNodeValue());
						rewardIndex=rewardsList.indexOf(new Reward(rewardWeightNode.getNodeName()));
						rewardsList.get(rewardIndex).setWeight(new Float(weightChildList.item(0).getNodeValue()));
						Collection<State> collectionStates = statesList.values();
						Iterator<State> statesIterator = collectionStates.iterator();
						while(statesIterator.hasNext()){
							State tempState = (State)statesIterator.next();
							tempState.addWeightReward(rewardWeightNode.getNodeName(),new Float(weightChildList.item(0).getNodeValue()));
						}
						rewardWeightNode=rewardWeightNode.getNextSibling();
					}					
				}     
			}
			//getting rewards weight
			NodeList policyNodeList = doc.getElementsByTagName("policy");
			System.out.println("Getting Rewards policy...");
			for(int s = 0; s < policyNodeList.getLength(); s++){				
				Node policyNode = policyNodeList.item(s);
				if (policyNode.getNodeType() == Node.ELEMENT_NODE) {
					Element policyElement = (Element) policyNodeList.item(s);
					Node rewardPolicyNode =policyElement.getFirstChild();
					while(rewardPolicyNode!=null){
						NodeList policyList=policyElement.getElementsByTagName(rewardPolicyNode.getNodeName());
						Node policyItemNode=policyList.item(0);
						NodeList policyChildList=policyItemNode.getChildNodes();
						System.out.println("Name Reward "+rewardPolicyNode.getNodeName()+" Policy: "+ policyChildList.item(0).getNodeValue());
						rewardIndex=rewardsList.indexOf(new Reward(rewardPolicyNode.getNodeName()));
						rewardsList.get(rewardIndex).setPolicy(policyChildList.item(0).getNodeValue());
						rewardPolicyNode = rewardPolicyNode.getNextSibling();
					}					
				}     
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rewardsList;
	}
	
	public static void generateWrappers(String namePackage,String interfacesPath, List<String> interfacesList, List<Reward> rewardsList, Map<String, State> statesList){
		//generate a wrapper for each interface
		int i, j, nAlternatives;
		boolean initialState = false;
		String output;
		FileOutputStream fos,factoryWrapperfos=null;
		PrintStream print,factoryWrapperprint;
		List<String> params = new ArrayList<String>();
		Collection<State> c = statesList.values();
		Iterator<State> iter = c.iterator();
	    try {
			factoryWrapperfos= new FileOutputStream(interfacesPath+"/"+"FactoryWrapper.java");
			factoryWrapperprint=new PrintStream(factoryWrapperfos);
			factoryWrapperprint.append("package "+namePackage+";\n");
			factoryWrapperprint.append("public class FactoryWrapper{\n ");

			for(i = 0; i<interfacesList.size() ;i++){
				String interfc=interfacesList.get(i);
				State tempStateForOptional=null;
				initialState = false;
				//count the number of possible alternatives and check if it's the initial state
				nAlternatives = 0;
				iter = c.iterator();
				while(iter.hasNext()){
					State tempState = iter.next();
					if(tempState.getInterfaceName().equals(interfc))
					{
						nAlternatives ++;
						tempStateForOptional=tempState;
						if(tempState.getId() == 0)
							initialState = true;
					}						
				}
	
		    	//add method for interface i-th
				factoryWrapperprint.append("\tpublic static "+interfc+" get"+interfc+"(){\n");
				factoryWrapperprint.append("\t\treturn new "+interfc+"Wrapper();\n}\n");
		    	
				fos = new FileOutputStream(interfacesPath+"/"+interfc+"Wrapper"+".java");	
				print = new PrintStream(fos);
				print.append("package "+namePackage+";\n");
				print.append("import java.util.List; \nimport java.util.Map; \nimport java.util.HashMap;\n" +
						"import java.util.ArrayList;\n");
				print.append("public class "+interfc+"Wrapper implements " + interfc +" {\n");		
				//generate the parameters for the wrapper:
				if(nAlternatives > 1){
					//alternative list
					print.append("\nprivate List<String> alternatives = new ArrayList<String>();");
				}else{
					if(tempStateForOptional.isOptional()){
						//alternative list
						print.append("\nprivate List<String> alternatives = new ArrayList<String>();");
					}
				}
				print.append( "\nprivate Map<String,Float> mapReward = new HashMap<String,Float>();");
				print.append( "\nprivate List<String> rewardNameList = new ArrayList<String>();");
									
				//create constructor
				print.append("\n\n\tpublic "+interfc+"Wrapper(){");
				boolean done=false,totalWritten, weightWritten;
				//add rewards values
				for(j=0;j<rewardsList.size();j++){	
					String rewardTemp = rewardsList.get(j).getName();
					//create reaward list
					print.append("\n\t\trewardNameList.add(\""+rewardTemp+"\");");										
					//set the reward values for every state		
					iter = c.iterator();
					totalWritten=false;
					weightWritten=false;
					while(iter.hasNext()){
						State tempState = iter.next();
						if(tempState.getInterfaceName().equals(interfc))
						{
							if((nAlternatives > 1)||(tempState.isOptional()))
							{
								if(!totalWritten){
									print.append("\n\t\tmapReward.put(\"total" + rewardTemp + "\", " + rewardsList.get(rewardsList.indexOf(new Reward(rewardTemp))).getTotal() + "f);");
									totalWritten=true;
								}
								if(!weightWritten){
									print.append("\n\t\tmapReward.put(\"weight" + rewardTemp + "\", " + tempState.getWeightReward(rewardTemp) + "f);");
									weightWritten=true;
								}
								print.append("\n\t\tmapReward.put(\""+ tempState.getClassName() + rewardTemp +"Min\", " + tempState.getMinReward(rewardTemp) + "f);");
								print.append("\n\t\tmapReward.put(\""+ tempState.getClassName() + rewardTemp +"Max\", " + tempState.getMaxReward(rewardTemp) + "f);");
								if(!done)
									print.append("\n\t\talternatives.add(\""+tempState.getClassName()+"\");");
							}							
							print.append("\n\t\tmapReward.put(\""+ tempState.getClassName() + rewardTemp +"\", " + tempState.getStateReward(rewardTemp) + "f);");
							
						}
					}
					if((nAlternatives > 1)||tempStateForOptional.isOptional())
						print.append("\n\t\tmapReward.put(\"policy"+rewardTemp+"\","+new Float(rewardsList.get(j).getPolicy().equals("upper")?1:0)+"f);");					
					done=true;					
				}
				if(initialState)
					print.append("\n\t\tAlternativeUtility.start(rewardNameList);");
				print.append("\n\t}\n\n");
				
				//each element of the list contains the specification of a method
				List<String> code = Utility.updateMethods(interfacesPath+"/"+interfc);				
				String returnType, className;
				boolean isOptional;
				for(String method: code){
					output = "{";
					className = "";
					isOptional=false;
					method = method.trim();
					if(!method.isEmpty())
					{
						//parse the method definition
						method = method.substring(0, method.indexOf(';'));
						returnType = Utility.getReturnType(method);
						String param = method.substring(method.indexOf('(') + 1, method.indexOf(')')); 
						params = Utility.parseParameters(param);						
						String name = method.substring(0, method.indexOf('('));
						name = name.trim();
						name = name.substring(name.lastIndexOf(' ')+1, name.length());
												
						
						if(nAlternatives > 1)
						{
							//method getAlternative
							output += "\n" + "\t\tString choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);";
							iter = c.iterator();

							output+="\n\t\t"+interfc+" obj = null;";
							while(iter.hasNext()){
								State temp = iter.next();
								if(temp.getInterfaceName().equals(interfc))
								{
									//TODO: inserire if..else, non elenco di if
									output += "\n\t\tif(choice.equals(\"" + temp.getClassName() + "\")){";
									output += "\n\t\t\t obj = new " + temp.getClassName() +"();\n\t\t}";
								}
							}
						}
						else
						{
							iter = c.iterator();
							while(iter.hasNext()){
								State temp = iter.next();
								if(temp.getInterfaceName().equals(interfc))
								{
									if(temp.isOptional()){
										isOptional=true;
										//method+="throws Exception";//TODO: questo comando serve per aggiungere il throws dopo il metodo
										className = temp.getClassName();
										//method getAlternative
										output += "\n" + "\t\tString choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);";/*TODO: non facciamo l'optional 
										soltanto se sono entrambi zero, se per esempio abbiamo usability !=0 e time fuori di tanto, la facciamo
										comunque.*/

										output+="\n\t\t"+interfc+" obj = null;";
										output += "\n\t\tif(choice.equals(\"" + temp.getClassName() + "\")){";
										output += "\n\t\tobj = new " + temp.getClassName() +"();";
										/*output += "\n\t\telse{\n\t\t\t throw new Exception();\n\t\t}";// TODO: questa linea serve per aggiungere
										il throws exception dopo l'if sull'optional*/
									}else{
										className = temp.getClassName();
										output+="\n\t\t"+interfc+" obj = new " + className +"();";
									}
								}
							}
						}
							
						
						//void methods doesn't have return keyword
						if(method.contains("void"))
							output += "\n\t\tobj." + name +"(";
						else	
						{
							output += "\n\t\t" + returnType + " val =  obj." + name +"(";
						}
							
						for(String tempParam: params){
							if(params.get(params.size()-1).equals(tempParam))
								output += tempParam;
							else
								output += tempParam +", ";
						}

						
						output += ");";
						if(nAlternatives > 1)
							output += "\n\t\tAlternativeUtility.updateContext(rewardNameList, choice, mapReward);";
						else
							output += "\n\t\tAlternativeUtility.updateContext(rewardNameList, \""+ className +"\", mapReward);";
						if(!method.contains("void"))
							output += "\n\t\treturn val;";
						if(isOptional){
							output += "\n\t\t}";//questa serve per quando ho l'opzionale TODO: sistemare identazione, anche se non serve
							if(!method.contains("void"))
								output += "\n\treturn null;";
						}
						output += "\n\t}";
						//method contains the definition of the method, output the body
						print.append("\t" + method + output+"\n");
					}
					
				}				
				print.append("\n}");
				fos.close();
				print.close();
			}
			factoryWrapperprint.append("}\n");
			factoryWrapperfos.close();
			factoryWrapperprint.close();
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//TODO: sistemare parser, oppure creare classe Parser ad-hoc
	private static String getReturnType(String method) {
		String[] keywords = method.split(" ");
		boolean exit = false;
		String word="";
		for(int i=0;i<keywords.length && !exit ;i++){
			word = keywords[i];
			if(!word.equals("public") && !word.equals("abstract"))
				exit = true;
		}
		return word;
	}

	private static List<String> parseParameters(String param) {
		List<String> params =  new ArrayList<String>();
		String temp;
		int begin = 0;
		char[] p = param.toCharArray();
		for(int i=0; i<p.length; i++){
			if(p[i] == ','){
				temp = param.substring(begin, i);
				temp = temp.trim();
				temp = temp.substring(temp.lastIndexOf(' ')+1, temp.length());
				params.add(temp);
				begin = i;
			}
			else if(i==p.length-1){
				temp = param.substring(begin, i+1);
				temp = temp.trim();
				temp = temp.substring(temp.lastIndexOf(' ')+1, temp.length());
				params.add(temp);
			}
		}		
		return params;
	}

	private static List<String> updateMethods(String interfc) {
		BufferedReader in;
		boolean add;
		List<String> code = new ArrayList<String>();		
		try {
			System.out.println("Processing interface: " +interfc+".java");
			in = new BufferedReader(new FileReader(interfc+".java"));
			String str;
			add = false;
		    while ((str = in.readLine()) != null) {
		        if(str.contains("{"))
		        	add = true;
		        while(add){
		        	str = in.readLine();
		        	if(!str.contains("}"))
		        		code.add(str);
		        	else
		        		add = false;
		        }
		    }
		    in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return code;
	}

	public static void printStatesSet(Map<String, State> statesList){
		//print the state list created
		System.out.println("--State List--");
		Collection<State> c = statesList.values();
		Iterator<State> iter = c.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}
		System.out.println("--");		
	}
	
	public static void generateEmptyInterfaces(String namePackage,String destinationPath, List<String> interfacesList){
		FileOutputStream fos;
		PrintStream print;
		try {			
			for(int i=0;i<interfacesList.size();i++){
				//generate the interfaces
				String interfc=interfacesList.get(i);			    
				fos = new FileOutputStream(destinationPath+"/"+interfc+".java");				
				print = new PrintStream(fos);
				print.append("package "+namePackage+";\n");
				print.append("public interface "+interfc+" {\n");
				print.append("\n}");
				fos.close();
				print.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateEmptyClasses(String namePackage,String destinationPath,Map<String, State> statesList){
		FileOutputStream fos;
		PrintStream print;
		Collection<State> c = statesList.values();
		Iterator<State> iter = c.iterator();
		try {
			while(iter.hasNext()){
				//generate the classes
				State state = iter.next();
				if(!state.getInterfaceName().equals(""))
				{
					fos = new FileOutputStream(destinationPath+"/"+state.getClassName()+".java");
					print = new PrintStream(fos);
					print.append("package "+namePackage+";\n");
					print.append("public class "+state.getClassName()+" implements "+state.getInterfaceName()+" {\n");
					print.append("\n}");
					fos.close();
					print.close();
				}			    
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

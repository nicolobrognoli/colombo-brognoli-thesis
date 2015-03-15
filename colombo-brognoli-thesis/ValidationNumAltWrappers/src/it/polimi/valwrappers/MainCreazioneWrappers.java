package it.polimi.valwrappers;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Map;

public class MainCreazioneWrappers {
	private final int timeActivity=50;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int alternatives=Integer.parseInt(args[0]),activities=Integer.parseInt(args[1]);
		MainCreazioneWrappers main=new MainCreazioneWrappers();
		main.createClasses(alternatives,activities);
	}

	public void createClasses(int alternatives, int activities){
		int i,j;
		char className='A';
		try {
			//creazione starterWrapper
			FileOutputStream  file = new FileOutputStream("src/it/polimi/valwrappers/StarterWrapper.java");
			PrintStream output = new PrintStream(file);
			output.append("\npackage it.polimi.valwrappers;");
			output.append("import java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;");
			output.append("\npublic class StarterWrapper{\n private Map<String,Float> mapReward = new HashMap<String,Float>();"+
		"\nprivate List<String> rewardNameList = new ArrayList<String>();"+
		"\nprivate List<String> alternatives = new ArrayList<String>();");
			output.append("public StarterWrapper(){\n");
			output.append("rewardNameList.add(\"time\");");
			output.append("rewardNameList.add(\"usability\");");
			output.append("		mapReward.put(\"totaltime\", "+activities*0.05+"f);"+
			"mapReward.put(\"weighttime\", 0.7f);");
			output.append("		mapReward.put(\"totalusability\","+activities+"f);"+
			"mapReward.put(\"weightusability\", 0.3f);");
			output.append("		mapReward.put(\"policyusability\", 1.0f);"+
					"mapReward.put(\"policytime\", 0.0f);");
			output.append("\nalternatives.add(\"StartClass\");");
			output.append("\nmapReward.put(\"StartClasstime\","+this.timeActivity/1000+"f);");
			output.append("\nmapReward.put(\"StartClasstimeMin\","+(this.timeActivity/1000*(activities)+Math.random()/10)+"f);");
			output.append("\nmapReward.put(\"StartClasstimeMax\","+(this.timeActivity/1000*(activities)+Math.random()/10)+"f);");
			output.append("\nmapReward.put(\"StartClassusability\","+1+"f);");
			output.append("\nmapReward.put(\"StartClassusabilityMin\","+((activities)+Math.random()*10)+"f);");
			output.append("\nmapReward.put(\"StartClassusabilityMax\","+((activities)+Math.random()*10)+"f);");
			output.append("AlternativeUtility.start(rewardNameList);");
			output.append("\n}\npublic void doActivity(){\n		");
			output.append("StartClass obj=new StartClass();");
			output.append("		obj.doActivity();"+
			"AlternativeUtility.updateContext(rewardNameList, \"StartClass\", mapReward);"+
		"}"+
	"}");
			
		//creazione wrappers
		for(i=0;i<alternatives;i++){
			file = new FileOutputStream("src/it/polimi/valwrappers/"+className+".java");
			output = new PrintStream(file);
			output.append("\npackage it.polimi.valwrappers;");
			output.append("\npublic class "+className+" implements ActivityInterface{");
			output.append("\n@Override\npublic void doActivity(){\ntry{\nThread.sleep(50);");
			output.append("\n} catch (InterruptedException e) {\ne.printStackTrace();\n}\n}\n}");
			className++;
		}
		for(j=1;j<activities;j++){
			file = new FileOutputStream("src/it/polimi/valwrappers/Wrapper"+j+".java");
			output = new PrintStream(file);
			output.append("\npackage it.polimi.valwrappers;");
			output.append("import java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;");
			output.append("\npublic class Wrapper"+j+"{\nprivate Map<String,Float> mapReward = new HashMap<String,Float>();"+
		"\nprivate List<String> rewardNameList = new ArrayList<String>();"+
		"\nprivate List<String> alternatives = new ArrayList<String>();");
			output.append("public Wrapper"+j+"(){\n");
			output.append("rewardNameList.add(\"time\");");
			output.append("rewardNameList.add(\"usability\");");
			output.append("		mapReward.put(\"totaltime\", "+activities*0.05+"f);"+
			"mapReward.put(\"weighttime\", 0.7f);");
			output.append("		mapReward.put(\"totalusability\","+activities+"f);"+
			"mapReward.put(\"weightusability\", 0.3f);");
			output.append("		mapReward.put(\"policyusability\", 1.0f);"+
					"mapReward.put(\"policytime\", 0.0f);");
			for(i=0,className='A';i<alternatives;i++,className++){
				output.append("\nalternatives.add(\""+className+"\");");
				output.append("\nmapReward.put(\""+className+"time\","+this.timeActivity/1000+"f);");
				output.append("\nmapReward.put(\""+className+"timeMin\","+(this.timeActivity/1000*(activities-j)+Math.random()/10)+"f);");
				output.append("\nmapReward.put(\""+className+"timeMax\","+(this.timeActivity/1000*(activities-j)+Math.random()/10)+"f);");
				output.append("\nmapReward.put(\""+className+"usability\","+1+"f);");
				output.append("\nmapReward.put(\""+className+"usabilityMin\","+((activities-j)+Math.random()*10)+"f);");
				output.append("\nmapReward.put(\""+className+"usabilityMax\","+((activities-j)+Math.random()*10)+"f);");
			}
			output.append("\n}\npublic void doActivity(){\n	");
			if(alternatives>1){
				output.append("	String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);"
				+"ActivityInterface obj = null;");
				for(i=0,className='A';i<alternatives;i++,className++){
					output.append("if(choice.equals(\""+className+"\")){"
					 +"obj = new "+className+"();"
				+"}");
				}
			}
			else{
				output.append("String choice= \"A\";\n ActivityInterface obj = new A();");
			}
			output.append("		obj.doActivity();"+
			"AlternativeUtility.updateContext(rewardNameList, choice, mapReward);"+
		"}"+
	"}");
		}
		//creazione classe FactoryWrapper
		file = new FileOutputStream("src/it/polimi/valwrappers/FactoryWrapper.java");
		output = new PrintStream(file);
		output.append("\npackage it.polimi.valwrappers;");
		output.append("\npublic class FactoryWrapper{");
		output.append(" 	public static StarterWrapper getStarterWrapper(){"+
		"return new StarterWrapper();"+
		"}");
		for(j=1;j<activities;j++){
			output.append(" 	\npublic static Wrapper"+j+" getWrapper"+j+"(){"+
					"return new Wrapper"+j+"();"+
					"}");
		}
		output.append("\n}");
		//crezione classe Main
		file = new FileOutputStream("src/it/polimi/valwrappers/MainEsecuzione.java");
		output = new PrintStream(file);
		output.append("\npackage it.polimi.valwrappers;");
		output.append("\npublic class MainEsecuzione{");	
		output.append("\npublic static void main(String[] args) {");
		output.append("\nlong start=System.nanoTime(),end;");
		output.append("\n FactoryWrapper.getStarterWrapper().doActivity();");
		for(j=1;j<activities;j++){
			output.append("\n FactoryWrapper.getWrapper"+j+"().doActivity();");
		}
		output.append("\nend=System.nanoTime();");
		output.append("\nSystem.out.println((end-start)/Math.pow(10, 9));");
		output.append("\n}\n}");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

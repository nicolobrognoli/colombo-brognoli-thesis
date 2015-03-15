package it.polimi.validationwrappers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class MainCreazioneWrappers {
	private final int timeActivity=50;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int requirements=Integer.parseInt(args[0]),activities=Integer.parseInt(args[1]);
		MainCreazioneWrappers main=new MainCreazioneWrappers();
		main.createClasses(requirements,activities);
	}

	public void createClasses(int requirements, int activities) {

		int i,j,cont;
		char requirementName='h',className='A';
		try {
			//creazione starterWrapper
			FileOutputStream  file = new FileOutputStream("src/it/polimi/validationwrappers/StarterWrapper.java");
			PrintStream output = new PrintStream(file);
			output.append("\npackage it.polimi.validationwrappers;");
			output.append("import java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;");
			output.append("\npublic class StarterWrapper{\n private Map<String,Float> mapReward = new HashMap<String,Float>();"+
		"\nprivate List<String> rewardNameList = new ArrayList<String>();"+
		"\nprivate List<String> alternatives = new ArrayList<String>();");
			output.append("public StarterWrapper(){\n");
			output.append("rewardNameList.add(\"time\");");
			output.append("		mapReward.put(\"totaltime\", "+activities*0.05+"f);"+
			"mapReward.put(\"weighttime\", 0.7f);");
			output.append("mapReward.put(\"policytime\", 0.0f);");
			output.append("\nmapReward.put(\"StartClasstime\","+this.timeActivity/1000+"f);");
			output.append("\nmapReward.put(\"StartClasstimeMin\","+(this.timeActivity/1000*(activities)+Math.random()/10)+"f);");
			output.append("\nmapReward.put(\"StartClasstimeMax\","+(this.timeActivity/1000*(activities)+Math.random()/10)+"f);");
			for(i=0;i<(requirements-1);i++,requirementName++){
				output.append("rewardNameList.add(\""+requirementName+"\");");
				output.append("		mapReward.put(\"total"+requirementName+"\", "+activities+"f);"+
						"mapReward.put(\"weight"+requirementName+"\", "+(0.3/(requirements-1))+"f);");
				if(i%2==1)
					output.append("mapReward.put(\"policy"+requirementName+"\", 1.0f);");
				else
					output.append("mapReward.put(\"policy"+requirementName+"\", 0.0f);");
				output.append("\nmapReward.put(\"StartClass"+requirementName+"\","+1+"f);");
				output.append("\nmapReward.put(\"StartClass"+requirementName+"Min\","+((activities)+Math.random()*10)+"f);");
				output.append("\nmapReward.put(\"StartClass"+requirementName+"Max\","+((activities)+Math.random()*10)+"f);");
			}
			output.append("\nalternatives.add(\"StartClass\");");

			output.append("AlternativeUtility.start(rewardNameList);");
			output.append("\n}\npublic void doActivity(){\n		");
			output.append("StartClass obj=new StartClass();");
			output.append("		obj.doActivity();"+
			"AlternativeUtility.updateContext(rewardNameList, \"StartClass\", mapReward);"+
		"}"+
	"}");
		//creazione wrappers
		for(j=1;j<activities;j++){
			file = new FileOutputStream("src/it/polimi/validationwrappers/Wrapper"+j+".java");
			output = new PrintStream(file);
			output.append("\npackage it.polimi.validationwrappers;");
			output.append("import java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;");
			output.append("\npublic class Wrapper"+j+"{\nprivate Map<String,Float> mapReward = new HashMap<String,Float>();"+
		"\nprivate List<String> rewardNameList = new ArrayList<String>();"+
		"\nprivate List<String> alternatives = new ArrayList<String>();");
			output.append("public Wrapper"+j+"(){\n");
			output.append("rewardNameList.add(\"time\");");
			output.append("		mapReward.put(\"totaltime\", "+activities*0.05+"f);"+
			"mapReward.put(\"weighttime\", 0.7f);");
			output.append("mapReward.put(\"policytime\", 0.0f);");
			for(cont=0,className='A';cont<3;cont++,className++){
				output.append("\nalternatives.add(\""+className+"\");");
				output.append("\nmapReward.put(\""+className+"time\","+this.timeActivity/1000+"f);");
				output.append("\nmapReward.put(\""+className+"timeMin\","+(this.timeActivity/1000*(activities-j)+Math.random()/10)+"f);");
				output.append("\nmapReward.put(\""+className+"timeMax\","+(this.timeActivity/1000*(activities-j)+Math.random()/10)+"f);");
			}
			for(i=0,requirementName='h';i<(requirements-1);i++,requirementName++){
				output.append("rewardNameList.add(\""+requirementName+"\");");
				output.append("		mapReward.put(\"total"+requirementName+"\", "+activities+"f);"+
						"mapReward.put(\"weight"+requirementName+"\", "+(0.3/(requirements-1))+"f);");
				if(i%2==1)
					output.append("mapReward.put(\"policy"+requirementName+"\", 1.0f);");
				else
					output.append("mapReward.put(\"policy"+requirementName+"\", 0.0f);");
				for(cont=0,className='A';cont<3;cont++,className++){
					output.append("\nmapReward.put(\""+className+requirementName+"\","+1+"f);");
					output.append("\nmapReward.put(\""+className+requirementName+"Min\","+((activities-j)+Math.random()*10)+"f);");
					output.append("\nmapReward.put(\""+className+requirementName+"Max\","+((activities-j)+Math.random()*10)+"f);");
				}
			}
			output.append("\n}\npublic void doActivity(){\n		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);"
			+"ActivityInterface obj = null;");
			for(i=0,requirementName='A';i<3;i++,requirementName++){
				output.append("if(choice.equals(\""+requirementName+"\")){"
				 +"obj = new "+requirementName+"();"
			+"}");
			}
			output.append("		obj.doActivity();"+
			"AlternativeUtility.updateContext(rewardNameList, choice, mapReward);"+
		"}"+
	"}");
		}
		//creazione classe FactoryWrapper
		file = new FileOutputStream("src/it/polimi/validationwrappers/FactoryWrapper.java");
		output = new PrintStream(file);
		output.append("\npackage it.polimi.validationwrappers;");
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
		file = new FileOutputStream("src/it/polimi/validationwrappers/MainEsecuzione.java");
		output = new PrintStream(file);
		output.append("\npackage it.polimi.validationwrappers;");
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

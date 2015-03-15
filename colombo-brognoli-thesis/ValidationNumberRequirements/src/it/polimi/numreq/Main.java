package it.polimi.numreq;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;






public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberRequirements=Integer.parseInt(args[0]);
		Main m=new Main();
		m.createClasses(numberRequirements-1);
	}
	
	public void createClasses(int requirements){
		int i;
		char requirementName='h';
		try {
		FileOutputStream  file = new FileOutputStream("src/it/polimi/numreq/Wrapper.java");
		PrintStream output = new PrintStream(file);
		output.append("package it.polimi.numreq;\nimport java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;");
		output.append("\npublic class Wrapper implements ActivityInterface{");
		output.append("\n	private Map<String,Float> mapReward = new HashMap<String,Float>();"+
	"\nprivate List<String> rewardNameList = new ArrayList<String>();"+
	"\nprivate List<String> alternatives = new ArrayList<String>();");
		output.append("public Wrapper(){\n");
		output.append("rewardNameList.add(\"time\");");
		output.append("mapReward.put(\"totaltime\", 22.0f);");
		output.append("mapReward.put(\"policytime\", 0.0f);");
		output.append("mapReward.put(\"weighttime\", 0.0f);");
		output.append("mapReward.put(\"Atime\", 6.0f);");
		output.append("mapReward.put(\"AtimeMin\", 6.0f);");
		output.append("mapReward.put(\"AtimeMax\", 6.0f);");
		output.append("mapReward.put(\"Btime\", 6.0f);");
		output.append("mapReward.put(\"BtimeMin\", 6.0f);");
		output.append("mapReward.put(\"BtimeMax\", 6.0f);");
		output.append("mapReward.put(\"Ctime\", 6.0f);");
		output.append("mapReward.put(\"CtimeMin\", 6.0f);");
		output.append("mapReward.put(\"CtimeMax\", 6.0f);");
		output.append("alternatives.add(\"A\");");
		output.append("alternatives.add(\"B\");");
		output.append("alternatives.add(\"C\");");
		for(i=0,requirementName='h';i<requirements;i++,requirementName++){
			output.append("rewardNameList.add(\""+requirementName+"\");");
			output.append("mapReward.put(\"total"+requirementName+"\", 22.0f);");
			output.append("mapReward.put(\"policy"+requirementName+"\", 0.0f);");
			output.append("mapReward.put(\"weight"+requirementName+"\", 0.0f);");
			output.append("\nmapReward.put(\"A"+requirementName+"\",6.0f);");
			output.append("\nmapReward.put(\"A"+requirementName+"Min\",6.0f);");
			output.append("\nmapReward.put(\"A"+requirementName+"Max\",6.0f);");
			output.append("\nmapReward.put(\"B"+requirementName+"\",6.0f);");
			output.append("\nmapReward.put(\"B"+requirementName+"Min\",6.0f);");
			output.append("\nmapReward.put(\"B"+requirementName+"Max\",6.0f);");
			output.append("\nmapReward.put(\"C"+requirementName+"\",6.0f);");
			output.append("\nmapReward.put(\"C"+requirementName+"Min\",6.0f);");
			output.append("\nmapReward.put(\"C"+requirementName+"Max\",6.0f);");
		}
		output.append("\n}\npublic void doActivity(){\n		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);"
		+"ActivityInterface obj = null;");
			output.append("if(choice.equals(\"A\")){"
			 +"obj = new A();"
		+"}");
			output.append("if(choice.equals(\"B\")){"
					 +"obj = new B();"
				+"}");
			output.append("if(choice.equals(\"C\")){"
					 +"obj = new C();"
				+"}");
		output.append("		obj.doActivity();"+
		"AlternativeUtility.updateContext(rewardNameList, choice, mapReward);"+
	"}"+
"}");
		
		//inizio creazione StarterWrapper
		file = new FileOutputStream("src/it/polimi/numreq/StarterWrapper.java");
		output = new PrintStream(file);
		output.append("package it.polimi.numreq;\nimport java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;");
		output.append("\npublic class StarterWrapper implements ActivityInterface{");
		output.append("\n	private Map<String,Float> mapReward = new HashMap<String,Float>();"+
	"\nprivate List<String> rewardNameList = new ArrayList<String>();"+
	"\nprivate List<String> alternatives = new ArrayList<String>();");
		output.append("public StarterWrapper(){\n");
		output.append("rewardNameList.add(\"time\");");
		output.append("mapReward.put(\"totaltime\", 22.0f);");
		output.append("mapReward.put(\"policytime\", 0.0f);");
		output.append("mapReward.put(\"weighttime\", 0.0f);");
		output.append("mapReward.put(\"Atime\", 6.0f);");
		output.append("mapReward.put(\"AtimeMin\", 6.0f);");
		output.append("mapReward.put(\"AtimeMax\", 6.0f);");
		output.append("mapReward.put(\"Btime\", 6.0f);");
		output.append("mapReward.put(\"BtimeMin\", 6.0f);");
		output.append("mapReward.put(\"BtimeMax\", 6.0f);");
		output.append("mapReward.put(\"Ctime\", 6.0f);");
		output.append("mapReward.put(\"CtimeMin\", 6.0f);");
		output.append("mapReward.put(\"CtimeMax\", 6.0f);");
		output.append("alternatives.add(\"A\");");
		output.append("alternatives.add(\"B\");");
		output.append("alternatives.add(\"C\");");
		for(i=0,requirementName='h';i<requirements;i++,requirementName++){
			output.append("rewardNameList.add(\""+requirementName+"\");");
			output.append("mapReward.put(\"total"+requirementName+"\", 22.0f);");
			output.append("mapReward.put(\"policy"+requirementName+"\", 0.0f);");
			output.append("mapReward.put(\"weight"+requirementName+"\", 0.0f);");
			output.append("\nmapReward.put(\"A"+requirementName+"\",6.0f);");
			output.append("\nmapReward.put(\"A"+requirementName+"Min\",6.0f);");
			output.append("\nmapReward.put(\"A"+requirementName+"Max\",6.0f);");
			output.append("\nmapReward.put(\"B"+requirementName+"\",6.0f);");
			output.append("\nmapReward.put(\"B"+requirementName+"Min\",6.0f);");
			output.append("\nmapReward.put(\"B"+requirementName+"Max\",6.0f);");
			output.append("\nmapReward.put(\"C"+requirementName+"\",6.0f);");
			output.append("\nmapReward.put(\"C"+requirementName+"Min\",6.0f);");
			output.append("\nmapReward.put(\"C"+requirementName+"Max\",6.0f);");
		}
		output.append("AlternativeUtility.start(rewardNameList);\n}\npublic void doActivity(){\n");
		output.append("		try {"+
			"Thread.sleep(50);"+
		"} catch (InterruptedException e) {"+
			"e.printStackTrace();"+
		"}");
		output.append("AlternativeUtility.updateContext(rewardNameList, \"A\", mapReward);"+
	"}"+
"}");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

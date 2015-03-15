import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;






public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberAlternatives=Integer.parseInt(args[0]);
		Main m=new Main();
		m.createClasses(numberAlternatives);
	}
	
	public void createClasses(int alternatives){
		int i;
		char className='A';
		try {
		for(i=0;i<alternatives;i++){
			FileOutputStream file;
			file = new FileOutputStream("src/"+className+".java");
			PrintStream output = new PrintStream(file);
			output.append("\npublic class "+className+" implements ActivityInterface{");
			output.append("\n@Override\npublic void doActivity(){\ntry{\nThread.sleep(50);");
			output.append("\n} catch (InterruptedException e) {\ne.printStackTrace();\n}\n}\n}");
			className++;
		}
		FileOutputStream  file = new FileOutputStream("src/Wrapper.java");
		PrintStream output = new PrintStream(file);
		output.append("import java.util.ArrayList;\nimport java.util.HashMap;\nimport java.util.List;\nimport java.util.Map;");
		output.append("\npublic class Wrapper implements ActivityInterface{");
		output.append("\n	private Map<String,Float> mapReward = new HashMap<String,Float>();"+
	"\nprivate List<String> rewardNameList = new ArrayList<String>();"+
	"\nprivate List<String> alternatives = new ArrayList<String>();");
		output.append("public Wrapper(){\n");
		output.append("rewardNameList.add(\"time\");");
		output.append("rewardNameList.add(\"usability\");");
		output.append("		mapReward.put(\"totaltime\", 22.0f);"+
		"mapReward.put(\"weighttime\", 0.7f);");
		output.append("		mapReward.put(\"totalusability\", 17.0f);"+
		"mapReward.put(\"weightusability\", 0.3f);");
		output.append("		mapReward.put(\"policyusability\", 1.0f);"+
				"mapReward.put(\"policytime\", 0.0f);");
		for(i=0,className='A';i<alternatives;i++,className++){
			output.append("\nalternatives.add(\""+className+"\");");
			output.append("\nmapReward.put(\""+className+"time\",6.0f);");
			output.append("\nmapReward.put(\""+className+"timeMin\",6.0f);");
			output.append("\nmapReward.put(\""+className+"timeMax\",6.0f);");
			output.append("\nmapReward.put(\""+className+"usability\",6.0f);");
			output.append("\nmapReward.put(\""+className+"usabilityMin\",6.0f);");
			output.append("\nmapReward.put(\""+className+"usabilityMax\",6.0f);");
		}
		output.append("\n}\npublic void doActivity(){\n		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);"
		+"ActivityInterface obj = null;");
		for(i=0,className='A';i<alternatives;i++,className++){
			output.append("if(choice.equals(\""+className+"\")){"
			 +"obj = new "+className+"();"
		+"}");
		}
		output.append("		obj.doActivity();"+
		"AlternativeUtility.updateContext(rewardNameList, choice, mapReward);"+
	"}"+
"}");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

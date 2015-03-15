
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1456{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1456(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07767879828051696f);
mapReward.put("AtimeMax",0.05614785758623314f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.05862185414678402f);
mapReward.put("BtimeMax",0.03296078301979577f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08628042661672572f);
mapReward.put("CtimeMax",0.023988366757288992f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",550.3630695809181f);
mapReward.put("AhMax",551.5696769932247f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",550.4206556541271f);
mapReward.put("BhMax",552.916656450219f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",551.4023952310524f);
mapReward.put("ChMax",549.6830465765819f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
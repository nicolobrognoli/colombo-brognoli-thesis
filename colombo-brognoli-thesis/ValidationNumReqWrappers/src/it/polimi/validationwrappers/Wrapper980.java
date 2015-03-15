
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper980{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper980(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06913274188760075f);
mapReward.put("AtimeMax",0.08849797089626311f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.060543725528113504f);
mapReward.put("BtimeMax",0.04653938370828127f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05080345439802544f);
mapReward.put("CtimeMax",0.005612514011137071f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1020.9052861560873f);
mapReward.put("AhMax",1026.7909380590122f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1026.7551178252827f);
mapReward.put("BhMax",1026.5759502914589f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1020.4143961313393f);
mapReward.put("ChMax",1027.2294408356636f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
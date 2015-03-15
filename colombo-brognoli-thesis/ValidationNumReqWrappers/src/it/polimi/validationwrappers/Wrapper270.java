
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper270{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper270(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.030816925366932247f);
mapReward.put("AtimeMax",0.04762787068666855f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.050645684439312375f);
mapReward.put("BtimeMax",0.010650236443142502f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04886021307428554f);
mapReward.put("CtimeMax",0.02853026891707643f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1737.9771458196255f);
mapReward.put("AhMax",1731.7738850300555f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1735.2872803062808f);
mapReward.put("BhMax",1739.2204826418365f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1735.4941213633726f);
mapReward.put("ChMax",1735.8757816409427f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
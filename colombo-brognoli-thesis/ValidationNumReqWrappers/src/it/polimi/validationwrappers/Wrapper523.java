
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper523{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper523(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.036135515025400175f);
mapReward.put("AtimeMax",0.024157114523357514f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.018020955969138774f);
mapReward.put("BtimeMax",0.09225480060871287f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06162697503331457f);
mapReward.put("CtimeMax",0.08632662030860258f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1478.162783115321f);
mapReward.put("AhMax",1477.564175112239f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1479.7867825495478f);
mapReward.put("BhMax",1478.584229980516f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1478.093363958428f);
mapReward.put("ChMax",1479.639647118926f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
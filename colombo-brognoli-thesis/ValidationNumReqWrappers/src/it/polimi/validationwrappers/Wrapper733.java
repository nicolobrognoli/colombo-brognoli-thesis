
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper733{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper733(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.045577125350022854f);
mapReward.put("AtimeMax",0.0312810350236248f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.015507865738279492f);
mapReward.put("BtimeMax",0.08525694139915545f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06811130323140288f);
mapReward.put("CtimeMax",0.09460046164804944f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1269.8046091315532f);
mapReward.put("AhMax",1268.3134278901696f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1273.0221312010774f);
mapReward.put("BhMax",1269.6066400171674f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1270.5356352211686f);
mapReward.put("ChMax",1267.6722202291483f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1531{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1531(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.015904778151676447f);
mapReward.put("AtimeMax",0.0555045819678305f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.047956249147748695f);
mapReward.put("BtimeMax",0.07954216396782973f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0998284824311679f);
mapReward.put("CtimeMax",0.0979537734760265f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",477.0496768880515f);
mapReward.put("AhMax",472.12571724293844f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",476.06621365121066f);
mapReward.put("BhMax",472.1010540101463f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",471.43474155286816f);
mapReward.put("ChMax",475.0483949013796f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
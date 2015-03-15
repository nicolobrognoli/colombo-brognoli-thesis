
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper844{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper844(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03409514318856825f);
mapReward.put("AtimeMax",0.007516224020797424f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.031135433248976774f);
mapReward.put("BtimeMax",0.08265013549328135f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03610909051743755f);
mapReward.put("CtimeMax",0.0016498353289070788f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1163.3383133781158f);
mapReward.put("AhMax",1164.9343186314968f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1159.7051891844192f);
mapReward.put("BhMax",1164.5572150534986f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1156.9789904082668f);
mapReward.put("ChMax",1163.1595703918442f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
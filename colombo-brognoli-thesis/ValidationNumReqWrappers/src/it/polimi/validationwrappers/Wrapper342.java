
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper342{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper342(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04888161525915654f);
mapReward.put("AtimeMax",0.011447022578945287f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.013879549411122993f);
mapReward.put("BtimeMax",0.07310958850534204f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02702062089116807f);
mapReward.put("CtimeMax",0.041858643315046f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1660.2146998633677f);
mapReward.put("AhMax",1664.3192317506946f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1667.0011939200954f);
mapReward.put("BhMax",1667.0034518260286f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1667.098672558848f);
mapReward.put("ChMax",1667.2654201696541f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1764{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1764(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02224750590686081f);
mapReward.put("AtimeMax",8.04834283264344E-4f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.04979586354150247f);
mapReward.put("BtimeMax",0.03559254655270111f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.034174197802358516f);
mapReward.put("CtimeMax",0.07442011442040716f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",244.41196101889375f);
mapReward.put("AhMax",237.5548162672938f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",240.2613884840161f);
mapReward.put("BhMax",245.54131325793293f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",238.65850710387826f);
mapReward.put("ChMax",238.67611842814213f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
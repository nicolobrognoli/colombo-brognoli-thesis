
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1284{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1284(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04594497044023103f);
mapReward.put("AtimeMax",0.019399887704506513f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.035045011661810496f);
mapReward.put("BtimeMax",0.0672340949017252f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05377017154367546f);
mapReward.put("CtimeMax",0.01860383652364924f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",722.5183630585426f);
mapReward.put("AhMax",720.5294680044466f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",724.202447796297f);
mapReward.put("BhMax",725.3999317854725f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",725.2415753023481f);
mapReward.put("ChMax",719.1642463293505f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
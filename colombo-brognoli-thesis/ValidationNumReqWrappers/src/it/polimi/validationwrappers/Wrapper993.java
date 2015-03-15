
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper993{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper993(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03156663169354612f);
mapReward.put("AtimeMax",0.04897721004170178f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.07212900072012085f);
mapReward.put("BtimeMax",0.010126375414982814f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.032698052888322046f);
mapReward.put("CtimeMax",0.07479795829470967f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1016.7412187668263f);
mapReward.put("AhMax",1009.0584659868739f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1007.4941750843115f);
mapReward.put("BhMax",1012.5792366019527f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1008.0072902724843f);
mapReward.put("ChMax",1007.5070367623829f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
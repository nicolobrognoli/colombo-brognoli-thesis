
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1294{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1294(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03216954697038823f);
mapReward.put("AtimeMax",0.06091589421553162f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.05171431530847671f);
mapReward.put("BtimeMax",0.06485308494773553f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.002095951090878212f);
mapReward.put("CtimeMax",0.04489247755418788f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",706.3420192850747f);
mapReward.put("AhMax",714.5619744572209f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",707.6104574008363f);
mapReward.put("BhMax",709.8813291247926f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",708.0996524539996f);
mapReward.put("ChMax",709.4106173388656f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
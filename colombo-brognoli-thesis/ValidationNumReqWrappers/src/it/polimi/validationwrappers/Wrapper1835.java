
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1835{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1835(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03370362275456695f);
mapReward.put("AtimeMax",0.055192083476579966f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.070483010881895f);
mapReward.put("BtimeMax",0.08455722546700063f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.009125228960559261f);
mapReward.put("CtimeMax",0.058110882850998156f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",167.71746145769683f);
mapReward.put("AhMax",173.71566190077593f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",170.06494413197098f);
mapReward.put("BhMax",166.6760622326686f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",170.2352433146408f);
mapReward.put("ChMax",170.04295957984147f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
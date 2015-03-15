
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1648{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1648(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.059996488545659f);
mapReward.put("AtimeMax",0.0846121676806062f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.024422118878015375f);
mapReward.put("BtimeMax",0.008082635476887524f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0037230533788308205f);
mapReward.put("CtimeMax",0.09892044399739386f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",352.3663945267036f);
mapReward.put("AhMax",359.70754768754256f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",358.157516297682f);
mapReward.put("BhMax",359.8401249237941f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",355.8059093922636f);
mapReward.put("ChMax",358.0396134257058f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
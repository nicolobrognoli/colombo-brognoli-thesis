
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper529{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper529(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05005352515583365f);
mapReward.put("AtimeMax",0.030801401215631442f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.009065628559300631f);
mapReward.put("BtimeMax",0.06634322242882232f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.020964816921316944f);
mapReward.put("CtimeMax",0.03976057824121441f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1473.4077392456663f);
mapReward.put("AhMax",1480.9950554294423f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1475.067909555973f);
mapReward.put("BhMax",1480.289476906088f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1471.7555233414953f);
mapReward.put("ChMax",1477.9020446549816f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
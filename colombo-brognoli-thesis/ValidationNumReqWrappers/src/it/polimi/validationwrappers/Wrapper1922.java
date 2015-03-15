
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1922{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1922(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.004738245755457593f);
mapReward.put("AtimeMax",0.04445101178530021f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.013278139812215196f);
mapReward.put("BtimeMax",0.04936554526738829f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07117433041986726f);
mapReward.put("CtimeMax",0.07893097055481327f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",86.86264220662278f);
mapReward.put("AhMax",82.33729932753576f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",86.29998666981295f);
mapReward.put("BhMax",84.89737663892758f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",78.92167085629718f);
mapReward.put("ChMax",79.03289216052099f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
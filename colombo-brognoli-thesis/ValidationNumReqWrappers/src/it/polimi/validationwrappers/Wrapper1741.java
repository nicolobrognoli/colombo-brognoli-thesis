
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1741{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1741(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.019558535604555595f);
mapReward.put("AtimeMax",0.08549396875318929f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.046639267316800195f);
mapReward.put("BtimeMax",0.05970998340937901f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08290650816447472f);
mapReward.put("CtimeMax",0.08783625122149616f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",268.96412005553384f);
mapReward.put("AhMax",264.6076464916196f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",266.55060788296373f);
mapReward.put("BhMax",262.08635642690285f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",264.77795418183047f);
mapReward.put("ChMax",267.677579972492f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
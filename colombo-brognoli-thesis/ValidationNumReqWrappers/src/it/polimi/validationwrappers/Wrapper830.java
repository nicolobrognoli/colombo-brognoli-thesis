
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper830{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper830(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.005696336227892074f);
mapReward.put("AtimeMax",0.08237825136965367f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.036608828442172635f);
mapReward.put("BtimeMax",0.06629813942222511f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07157474049977366f);
mapReward.put("CtimeMax",0.060426113487762036f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1179.5827928632518f);
mapReward.put("AhMax",1173.8817237695596f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1172.5643538649174f);
mapReward.put("BhMax",1170.5591727672718f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1177.1456732687425f);
mapReward.put("ChMax",1170.2228527115376f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
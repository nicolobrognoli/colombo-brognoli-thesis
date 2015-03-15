
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper193{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper193(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.058947743931936455f);
mapReward.put("AtimeMax",0.07574880184050553f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.041914804383209714f);
mapReward.put("BtimeMax",1.8524042329941536E-4f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0573768570642106f);
mapReward.put("CtimeMax",0.08677367007772127f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1808.576201497284f);
mapReward.put("AhMax",1809.4432553807983f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1807.6869211616795f);
mapReward.put("BhMax",1808.5852360051483f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1814.5858338842302f);
mapReward.put("ChMax",1812.5914182295292f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
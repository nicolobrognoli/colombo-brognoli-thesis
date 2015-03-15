
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper290{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper290(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07127111477174866f);
mapReward.put("AtimeMax",0.09226108322634445f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.036463698337726204f);
mapReward.put("BtimeMax",0.048533716658769224f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08136382635811759f);
mapReward.put("CtimeMax",0.025152765476761187f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1714.9401795065621f);
mapReward.put("AhMax",1718.3535827496214f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1718.198579695609f);
mapReward.put("BhMax",1717.7789532684858f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1714.6430583841968f);
mapReward.put("ChMax",1710.5467462530628f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
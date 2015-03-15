
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1129{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1129(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08860427171417533f);
mapReward.put("AtimeMax",0.0820928094788778f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.021443219034654726f);
mapReward.put("BtimeMax",0.023036315428830445f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06777249264768127f);
mapReward.put("CtimeMax",0.018708372189452004f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",879.0060269835718f);
mapReward.put("AhMax",880.4198411758235f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",879.2218574010873f);
mapReward.put("BhMax",871.3627818152925f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",879.689589268158f);
mapReward.put("ChMax",873.9641477910517f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
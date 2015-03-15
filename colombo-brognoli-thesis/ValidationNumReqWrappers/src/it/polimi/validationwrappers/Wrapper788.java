
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper788{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper788(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07866029474344918f);
mapReward.put("AtimeMax",0.05568088874241459f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.017607283661682092f);
mapReward.put("BtimeMax",0.09330152645520126f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05767335163891204f);
mapReward.put("CtimeMax",0.0625652550788386f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1213.3496338373347f);
mapReward.put("AhMax",1219.2741916685577f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1217.0049802949843f);
mapReward.put("BhMax",1214.2648177545589f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1214.8732368249691f);
mapReward.put("ChMax",1218.215717488381f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
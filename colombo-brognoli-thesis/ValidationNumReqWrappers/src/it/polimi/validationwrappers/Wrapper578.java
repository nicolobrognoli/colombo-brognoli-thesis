
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper578{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper578(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.012648890310439542f);
mapReward.put("AtimeMax",0.06611881791202726f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.030760852806490123f);
mapReward.put("BtimeMax",0.006202911812397927f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.050860014726438266f);
mapReward.put("CtimeMax",0.03727651202013497f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1431.5864782867397f);
mapReward.put("AhMax",1428.984808910593f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1424.8913191750403f);
mapReward.put("BhMax",1431.3836981971529f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1428.519917164635f);
mapReward.put("ChMax",1426.3096527469982f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
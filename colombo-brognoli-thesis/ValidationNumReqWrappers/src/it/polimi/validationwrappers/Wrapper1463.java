
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1463{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1463(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.008247793381469127f);
mapReward.put("AtimeMax",0.07312043418631312f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.016394755530313377f);
mapReward.put("BtimeMax",0.06384647503090991f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.025358174123759146f);
mapReward.put("CtimeMax",0.03835828433188172f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",544.2454192218655f);
mapReward.put("AhMax",545.3722166541977f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",541.9518112674799f);
mapReward.put("BhMax",546.8458038039881f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",546.6328386778375f);
mapReward.put("ChMax",543.964175501644f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
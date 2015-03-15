
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1781{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1781(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08176768530279653f);
mapReward.put("AtimeMax",0.06610079544057428f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.008332986544946741f);
mapReward.put("BtimeMax",0.07669222565705278f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02247801239848246f);
mapReward.put("CtimeMax",0.003996965955104126f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",219.6436989483261f);
mapReward.put("AhMax",224.22615126008836f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",220.45533853497025f);
mapReward.put("BhMax",228.52353438272107f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",228.98896558070467f);
mapReward.put("ChMax",227.079763776321f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
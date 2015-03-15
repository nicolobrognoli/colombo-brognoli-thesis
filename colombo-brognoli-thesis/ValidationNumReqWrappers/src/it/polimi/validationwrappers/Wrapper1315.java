
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1315{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1315(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06716039067108992f);
mapReward.put("AtimeMax",0.011383205472067736f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.0833087738930756f);
mapReward.put("BtimeMax",0.054525423360310056f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08762825612273359f);
mapReward.put("CtimeMax",0.08785522778308369f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",694.5970665665131f);
mapReward.put("AhMax",689.1623048204945f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",687.4438901947009f);
mapReward.put("BhMax",693.7805105271597f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",690.4627790803595f);
mapReward.put("ChMax",693.407844515875f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
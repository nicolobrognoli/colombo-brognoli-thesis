
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1702{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1702(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.034587206791809696f);
mapReward.put("AtimeMax",0.07122592453815417f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.032452697088558205f);
mapReward.put("BtimeMax",0.055536061331733354f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07876503918299609f);
mapReward.put("CtimeMax",0.09727725238529958f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",306.67891251355434f);
mapReward.put("AhMax",305.73194960887645f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",304.52440007793047f);
mapReward.put("BhMax",306.2512236303312f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",304.9269666474455f);
mapReward.put("ChMax",305.8077280720372f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
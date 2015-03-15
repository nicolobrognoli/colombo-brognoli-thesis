
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper194{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper194(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09696253616197612f);
mapReward.put("AtimeMax",0.02391883211335242f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.011475893951988402f);
mapReward.put("BtimeMax",0.004251976051029238f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05716909414958632f);
mapReward.put("CtimeMax",0.04680925349583169f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1807.746681639225f);
mapReward.put("AhMax",1808.6967659500424f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1813.073843770251f);
mapReward.put("BhMax",1815.1775765344933f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1813.2223610922854f);
mapReward.put("ChMax",1807.2568527654364f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
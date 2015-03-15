
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper458{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper458(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.019304721953835313f);
mapReward.put("AtimeMax",0.03900743820332283f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.004760903557087104f);
mapReward.put("BtimeMax",0.039392298339580356f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0358735889159207f);
mapReward.put("CtimeMax",0.06816069334925245f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1551.2111691173593f);
mapReward.put("AhMax",1547.407235372101f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1546.515628203017f);
mapReward.put("BhMax",1551.3478597256328f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1549.3502180475127f);
mapReward.put("ChMax",1545.4491420084396f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1874{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1874(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0036554862621296035f);
mapReward.put("AtimeMax",0.0493287513745998f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.012906411647853477f);
mapReward.put("BtimeMax",0.0697598791924275f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.056436680384713486f);
mapReward.put("CtimeMax",0.07511041631263363f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",128.5041987802233f);
mapReward.put("AhMax",133.86487590840864f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",132.24473907539652f);
mapReward.put("BhMax",126.07130894472638f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",134.17175276943237f);
mapReward.put("ChMax",128.2851441370931f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
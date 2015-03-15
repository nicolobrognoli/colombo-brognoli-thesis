
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1070{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1070(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.045827888581921494f);
mapReward.put("AtimeMax",0.019759772336297297f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.06486458003554452f);
mapReward.put("BtimeMax",0.0029733353771954516f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.041498228394570014f);
mapReward.put("CtimeMax",0.06001108537672829f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",934.1567888818894f);
mapReward.put("AhMax",935.551879498243f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",936.7693296490436f);
mapReward.put("BhMax",932.3441939199961f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",937.0500610518134f);
mapReward.put("ChMax",937.9485394738856f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
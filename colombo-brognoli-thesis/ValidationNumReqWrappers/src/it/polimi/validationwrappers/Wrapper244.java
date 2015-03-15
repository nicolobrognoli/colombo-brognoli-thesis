
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper244{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper244(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07182977861580761f);
mapReward.put("AtimeMax",0.02983331373322411f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.008187552642434693f);
mapReward.put("BtimeMax",0.0806890794563173f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0918384846930718f);
mapReward.put("CtimeMax",0.002610780994243411f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1756.5425731261819f);
mapReward.put("AhMax",1757.9505037225308f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1763.0146268164367f);
mapReward.put("BhMax",1759.3558800588767f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1762.593204757525f);
mapReward.put("ChMax",1760.1438508853655f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1104{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1104(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.007928918382547456f);
mapReward.put("AtimeMax",0.02103420371050585f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.047966718278139774f);
mapReward.put("BtimeMax",0.0999777751511809f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06748144203580385f);
mapReward.put("CtimeMax",0.06386057195873567f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",896.7745324770951f);
mapReward.put("AhMax",900.079270018721f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",896.2318830823754f);
mapReward.put("BhMax",904.7814176854905f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",897.0536778500867f);
mapReward.put("ChMax",899.9814408151307f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
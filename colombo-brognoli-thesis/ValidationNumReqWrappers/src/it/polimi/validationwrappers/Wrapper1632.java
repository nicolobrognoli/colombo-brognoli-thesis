
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1632{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1632(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06369097833843786f);
mapReward.put("AtimeMax",0.06150491191874149f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.054902456887027315f);
mapReward.put("BtimeMax",0.0029854580611507254f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.012187918050087876f);
mapReward.put("CtimeMax",0.02445249426656502f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",369.23119779802954f);
mapReward.put("AhMax",368.72377643645467f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",373.6119995842108f);
mapReward.put("BhMax",372.48829360897275f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",369.7745456995575f);
mapReward.put("ChMax",376.92527640144317f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
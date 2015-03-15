
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper195{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper195(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06681612074535628f);
mapReward.put("AtimeMax",0.059177358201407716f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.012603863859415965f);
mapReward.put("BtimeMax",0.07365065810603239f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.009214277195601205f);
mapReward.put("CtimeMax",0.03483429271802756f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1807.7209080785487f);
mapReward.put("AhMax",1810.3757979800985f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1809.4638936017966f);
mapReward.put("BhMax",1808.4567676201398f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1807.3098841994f);
mapReward.put("ChMax",1808.9333340447413f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper483{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper483(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08697645973730113f);
mapReward.put("AtimeMax",0.02828796991842817f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.09783346533634144f);
mapReward.put("BtimeMax",0.024271940453471898f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.005516299254363732f);
mapReward.put("CtimeMax",0.07792889918631626f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1526.267339215238f);
mapReward.put("AhMax",1526.965582319663f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1519.0655900776032f);
mapReward.put("BhMax",1526.021041606195f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1517.3375376486647f);
mapReward.put("ChMax",1521.8535183708032f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
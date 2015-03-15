
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1719{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1719(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09762219841418165f);
mapReward.put("AtimeMax",0.09452515662942788f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.061932956036067154f);
mapReward.put("BtimeMax",0.03229499240922855f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.010995044238572838f);
mapReward.put("CtimeMax",0.01256311175195125f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",286.49309787669694f);
mapReward.put("AhMax",281.7614612876492f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",290.9917755154489f);
mapReward.put("BhMax",290.28421786182884f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",286.7897324068152f);
mapReward.put("ChMax",283.7286961071548f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
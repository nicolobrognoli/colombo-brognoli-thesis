
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1489{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1489(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07821892893830497f);
mapReward.put("AtimeMax",0.08778995730725647f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.024515109448600848f);
mapReward.put("BtimeMax",0.06590795219372178f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01499917296120563f);
mapReward.put("CtimeMax",0.02577244307452501f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",513.3641981711858f);
mapReward.put("AhMax",517.998314402232f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",519.8671965639592f);
mapReward.put("BhMax",520.4352066856018f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",512.8308596986068f);
mapReward.put("ChMax",514.231693362105f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
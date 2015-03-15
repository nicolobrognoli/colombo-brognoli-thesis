
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper292{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper292(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04813493721491816f);
mapReward.put("AtimeMax",0.06037950112233346f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.015675689833571916f);
mapReward.put("BtimeMax",0.08788938656602446f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03467946846609159f);
mapReward.put("CtimeMax",0.04787106959353589f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1711.1882857621652f);
mapReward.put("AhMax",1716.3757692371823f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1715.4081990302286f);
mapReward.put("BhMax",1717.8797877359204f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1717.673700242166f);
mapReward.put("ChMax",1710.0297996782122f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
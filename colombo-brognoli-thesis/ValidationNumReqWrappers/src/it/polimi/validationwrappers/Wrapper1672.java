
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1672{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1672(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07764703697543159f);
mapReward.put("AtimeMax",0.049448292454780315f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.036079963032499905f);
mapReward.put("BtimeMax",0.095228271677088f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.061526784594916895f);
mapReward.put("CtimeMax",0.0758299763566849f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",329.811502887137f);
mapReward.put("AhMax",328.3523320709159f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",335.9772640090151f);
mapReward.put("BhMax",331.63584683774985f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",335.4253844160243f);
mapReward.put("ChMax",334.55091748565445f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
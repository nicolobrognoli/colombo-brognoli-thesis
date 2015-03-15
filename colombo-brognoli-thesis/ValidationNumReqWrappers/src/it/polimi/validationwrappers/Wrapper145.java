
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper145{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper145(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07715637793764343f);
mapReward.put("AtimeMax",0.07908424742805063f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",3.776735139282228E-4f);
mapReward.put("BtimeMax",0.022420163652945337f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.020810368245848355f);
mapReward.put("CtimeMax",0.05702536791424585f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1863.2467697289276f);
mapReward.put("AhMax",1855.3109773370825f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1864.6945930326604f);
mapReward.put("BhMax",1856.1484501932475f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1861.2274517129538f);
mapReward.put("ChMax",1861.3836381498409f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
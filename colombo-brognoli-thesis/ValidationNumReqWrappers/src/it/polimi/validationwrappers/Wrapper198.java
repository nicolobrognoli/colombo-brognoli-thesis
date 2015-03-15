
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper198{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper198(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.050405493631699036f);
mapReward.put("AtimeMax",0.0026329023099062043f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",8.692064732546467E-4f);
mapReward.put("BtimeMax",0.0918477406109282f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08101136713354075f);
mapReward.put("CtimeMax",0.041447986034602924f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1802.0159913609148f);
mapReward.put("AhMax",1807.985983834441f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1807.511184636555f);
mapReward.put("BhMax",1811.3704998185908f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1807.7337797250468f);
mapReward.put("ChMax",1809.3860995358666f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
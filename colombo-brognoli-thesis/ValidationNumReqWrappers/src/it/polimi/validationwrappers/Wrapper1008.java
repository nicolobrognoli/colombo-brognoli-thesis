
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1008{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1008(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06272698899275626f);
mapReward.put("AtimeMax",0.01234891885768794f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.036438833898033984f);
mapReward.put("BtimeMax",0.010768596522836727f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.003566323334406396f);
mapReward.put("CtimeMax",0.062148078503138714f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",995.1767029659388f);
mapReward.put("AhMax",1001.0434081222653f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",996.4321261719913f);
mapReward.put("BhMax",1001.7463720181973f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",995.2486961905707f);
mapReward.put("ChMax",1001.7157638933269f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
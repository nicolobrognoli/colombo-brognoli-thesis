
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1717{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1717(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05711487209394561f);
mapReward.put("AtimeMax",0.022006549099139027f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.016481984867042963f);
mapReward.put("BtimeMax",0.05796439795474434f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08807789548268166f);
mapReward.put("CtimeMax",0.001104767352554481f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",288.17159321633756f);
mapReward.put("AhMax",286.99011960407415f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",283.0241735098064f);
mapReward.put("BhMax",289.73459414815926f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",284.7161736451842f);
mapReward.put("ChMax",288.04519201426336f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
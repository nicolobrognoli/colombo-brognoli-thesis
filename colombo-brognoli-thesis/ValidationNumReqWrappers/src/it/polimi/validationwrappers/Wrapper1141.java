
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1141{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1141(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.01723747193090852f);
mapReward.put("AtimeMax",0.005094359331481213f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.04351238266497801f);
mapReward.put("BtimeMax",0.014684608736827243f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03652197488268033f);
mapReward.put("CtimeMax",0.09578300268409665f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",863.535130459571f);
mapReward.put("AhMax",865.9474626640251f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",862.3555382596836f);
mapReward.put("BhMax",865.7642618597016f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",865.4784192140536f);
mapReward.put("ChMax",860.3300233199718f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
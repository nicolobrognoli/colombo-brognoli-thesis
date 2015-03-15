
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper378{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper378(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08887153287989993f);
mapReward.put("AtimeMax",0.006412115124775597f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.028929692496263516f);
mapReward.put("BtimeMax",0.08315648379322146f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02675713111755108f);
mapReward.put("CtimeMax",0.07984470227365226f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1622.1570636353915f);
mapReward.put("AhMax",1623.0740277283319f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1624.1920625457287f);
mapReward.put("BhMax",1622.5167375534634f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1625.6994285514347f);
mapReward.put("ChMax",1622.1324665575669f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper20{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper20(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.054757393813617286f);
mapReward.put("AtimeMax",0.02039663165747655f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.041843593942117265f);
mapReward.put("BtimeMax",0.008510816908496954f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.006906117805837231f);
mapReward.put("CtimeMax",0.07353253234984271f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1989.1287855783064f);
mapReward.put("AhMax",1982.4933179954976f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1987.83593344823f);
mapReward.put("BhMax",1982.0706149726448f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1981.6749644179504f);
mapReward.put("ChMax",1981.1163316340312f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
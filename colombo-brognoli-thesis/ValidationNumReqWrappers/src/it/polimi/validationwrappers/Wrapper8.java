
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper8{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper8(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.057032118123481454f);
mapReward.put("AtimeMax",0.004068250704009369f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.055898356036770236f);
mapReward.put("BtimeMax",0.09968180183448688f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.012463309204992012f);
mapReward.put("CtimeMax",0.09168597753177453f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1998.6239973317581f);
mapReward.put("AhMax",1994.898918627969f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1996.2133243086757f);
mapReward.put("BhMax",1992.760801640145f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1992.7780999326637f);
mapReward.put("ChMax",1996.3020710134806f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
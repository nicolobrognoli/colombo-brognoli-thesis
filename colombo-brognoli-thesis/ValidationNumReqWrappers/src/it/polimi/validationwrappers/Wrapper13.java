
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper13{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper13(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.011943511729894019f);
mapReward.put("AtimeMax",0.08758587282381816f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.005950463895136693f);
mapReward.put("BtimeMax",0.021039057098915438f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.002764189899346592f);
mapReward.put("CtimeMax",0.04986834754431889f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1996.9527219758195f);
mapReward.put("AhMax",1992.1712344758982f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1990.175827199441f);
mapReward.put("BhMax",1987.9523869925065f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1995.001136448576f);
mapReward.put("ChMax",1996.7708771597186f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
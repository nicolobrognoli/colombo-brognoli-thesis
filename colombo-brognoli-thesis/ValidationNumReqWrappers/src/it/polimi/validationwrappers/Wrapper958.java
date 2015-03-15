
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper958{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper958(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.048702879577117816f);
mapReward.put("AtimeMax",0.07908957098648502f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.057164971320683544f);
mapReward.put("BtimeMax",0.07616037455476674f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08484163562471791f);
mapReward.put("CtimeMax",0.05529339198968344f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1048.8250617119756f);
mapReward.put("AhMax",1051.0231591345655f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1046.50525662564f);
mapReward.put("BhMax",1047.5597098266285f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1043.6414083805112f);
mapReward.put("ChMax",1044.0266871869123f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
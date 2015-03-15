
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1384{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1384(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07574971768368662f);
mapReward.put("AtimeMax",0.099003869645902f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.046545749824542515f);
mapReward.put("BtimeMax",0.019846574681050156f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.007242997314395006f);
mapReward.put("CtimeMax",0.021735954639482812f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",623.2511440516832f);
mapReward.put("AhMax",620.929475977521f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",625.2049911408697f);
mapReward.put("BhMax",617.4204732251742f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",622.473877317223f);
mapReward.put("ChMax",623.052421361677f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
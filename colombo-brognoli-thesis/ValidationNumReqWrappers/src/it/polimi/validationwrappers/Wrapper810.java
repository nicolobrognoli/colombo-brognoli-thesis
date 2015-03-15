
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper810{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper810(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.022754289851651566f);
mapReward.put("AtimeMax",0.09039146032636591f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.07562394646689437f);
mapReward.put("BtimeMax",0.04808956447264749f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.011945481966183513f);
mapReward.put("CtimeMax",0.08789616362827513f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1197.5946158866734f);
mapReward.put("AhMax",1194.6914387581846f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1194.556692106411f);
mapReward.put("BhMax",1196.8911142674224f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1197.0437508227415f);
mapReward.put("ChMax",1197.8886230777928f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
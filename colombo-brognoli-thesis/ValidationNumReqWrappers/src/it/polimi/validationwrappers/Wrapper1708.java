
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1708{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1708(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09522062013589211f);
mapReward.put("AtimeMax",0.006008188962740668f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.006398208258497873f);
mapReward.put("BtimeMax",0.03776551479792513f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03702239483567229f);
mapReward.put("CtimeMax",0.04785616976888082f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",298.0388788208914f);
mapReward.put("AhMax",296.56414580022476f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",300.5798954423532f);
mapReward.put("BhMax",294.56105844762726f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",292.1932782939074f);
mapReward.put("ChMax",295.81005377152604f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper585{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper585(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.024421719109570295f);
mapReward.put("AtimeMax",0.05194129197475873f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.03933921557147567f);
mapReward.put("BtimeMax",0.06612610251757998f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.038780985249350156f);
mapReward.put("CtimeMax",0.027567047925172873f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1415.6546343160194f);
mapReward.put("AhMax",1421.4306902892793f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1416.1434341843053f);
mapReward.put("BhMax",1419.7368107842597f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1421.912075842458f);
mapReward.put("ChMax",1415.7589453555772f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper871{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper871(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.028188999718751172f);
mapReward.put("AtimeMax",0.017650097143047327f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.01748465573254674f);
mapReward.put("BtimeMax",0.08583098594931135f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09289888186489051f);
mapReward.put("CtimeMax",0.09457547005523871f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1129.3615006541306f);
mapReward.put("AhMax",1135.4408173395097f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1137.717474135066f);
mapReward.put("BhMax",1131.7601943715165f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1137.2966768403858f);
mapReward.put("ChMax",1136.7418827061504f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
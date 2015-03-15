
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1098{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1098(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03449931472575842f);
mapReward.put("AtimeMax",0.08335145368030603f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.04243058800181454f);
mapReward.put("BtimeMax",0.042513733196990075f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",7.793826863248144E-4f);
mapReward.put("CtimeMax",0.08008992787953059f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",903.6191924079914f);
mapReward.put("AhMax",911.2991921166506f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",907.1459365961432f);
mapReward.put("BhMax",909.6572419272424f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",905.9417105070553f);
mapReward.put("ChMax",905.7202494847506f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
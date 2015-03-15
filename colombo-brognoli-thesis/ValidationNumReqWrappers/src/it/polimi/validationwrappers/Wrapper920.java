
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper920{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper920(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04086443644325442f);
mapReward.put("AtimeMax",0.07371296101122468f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.060919223884962216f);
mapReward.put("BtimeMax",0.06400822077918575f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.029017418183609135f);
mapReward.put("CtimeMax",0.02908028239755429f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1088.3949004280112f);
mapReward.put("AhMax",1084.1427076918528f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1080.7695302655288f);
mapReward.put("BhMax",1086.2358363847325f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1082.1480576213423f);
mapReward.put("ChMax",1087.7955634179364f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
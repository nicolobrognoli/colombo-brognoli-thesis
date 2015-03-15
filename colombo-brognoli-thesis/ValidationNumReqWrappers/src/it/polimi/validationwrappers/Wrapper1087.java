
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1087{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1087(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05125813052616658f);
mapReward.put("AtimeMax",0.03272751303241426f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.024563166857399298f);
mapReward.put("BtimeMax",0.011728010811844158f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0449623056075551f);
mapReward.put("CtimeMax",0.09049764123841761f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",914.5386602585598f);
mapReward.put("AhMax",919.846460356273f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",920.8564402101761f);
mapReward.put("BhMax",918.0862949880276f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",915.7006147008999f);
mapReward.put("ChMax",914.041157862663f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
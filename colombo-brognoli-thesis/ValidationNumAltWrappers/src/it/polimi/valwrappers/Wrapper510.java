
package it.polimi.valwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper510{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper510(){
rewardNameList.add("time");rewardNameList.add("usability");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);		mapReward.put("totalusability",2000f);mapReward.put("weightusability", 0.3f);		mapReward.put("policyusability", 1.0f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.034403054717494205f);
mapReward.put("AtimeMax",0.029308473506515453f);
mapReward.put("Ausability",1f);
mapReward.put("AusabilityMin",1492.430996050726f);
mapReward.put("AusabilityMax",1494.4122981127232f);
}
public void doActivity(){
	String choice= "A";
 ActivityInterface obj = new A();		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
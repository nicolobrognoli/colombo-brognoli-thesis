
package it.polimi.valwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper485{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper485(){
rewardNameList.add("time");rewardNameList.add("usability");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);		mapReward.put("totalusability",2000f);mapReward.put("weightusability", 0.3f);		mapReward.put("policyusability", 1.0f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04333314214829872f);
mapReward.put("AtimeMax",0.07253089630805279f);
mapReward.put("Ausability",1f);
mapReward.put("AusabilityMin",1515.1097893615704f);
mapReward.put("AusabilityMax",1518.7074566002316f);
}
public void doActivity(){
	String choice= "A";
 ActivityInterface obj = new A();		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
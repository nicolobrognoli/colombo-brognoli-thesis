
package it.polimi.valwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper853{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper853(){
rewardNameList.add("time");rewardNameList.add("usability");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);		mapReward.put("totalusability",2000f);mapReward.put("weightusability", 0.3f);		mapReward.put("policyusability", 1.0f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06661838271371523f);
mapReward.put("AtimeMax",0.011693051228680163f);
mapReward.put("Ausability",1f);
mapReward.put("AusabilityMin",1149.446959638423f);
mapReward.put("AusabilityMax",1154.1221643456236f);
}
public void doActivity(){
	String choice= "A";
 ActivityInterface obj = new A();		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
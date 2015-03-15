
package it.polimi.valwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StarterWrapper{
 private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public StarterWrapper(){
rewardNameList.add("time");rewardNameList.add("usability");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);		mapReward.put("totalusability",2000f);mapReward.put("weightusability", 0.3f);		mapReward.put("policyusability", 1.0f);mapReward.put("policytime", 0.0f);
alternatives.add("StartClass");
mapReward.put("StartClasstime",0f);
mapReward.put("StartClasstimeMin",0.060028539767445564f);
mapReward.put("StartClasstimeMax",0.04737976561771564f);
mapReward.put("StartClassusability",1f);
mapReward.put("StartClassusabilityMin",2000.8141368394554f);
mapReward.put("StartClassusabilityMax",2000.3475288735854f);AlternativeUtility.start(rewardNameList);
}
public void doActivity(){
		StartClass obj=new StartClass();		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, "StartClass", mapReward);}}
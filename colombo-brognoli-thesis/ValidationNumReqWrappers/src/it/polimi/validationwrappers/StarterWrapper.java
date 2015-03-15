
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StarterWrapper{
 private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public StarterWrapper(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
mapReward.put("StartClasstime",0f);
mapReward.put("StartClasstimeMin",0.08047351208455522f);
mapReward.put("StartClasstimeMax",0.03694077284833699f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("StartClassh",1f);
mapReward.put("StartClasshMin",2003.2003872204273f);
mapReward.put("StartClasshMax",2001.6600218535743f);
alternatives.add("StartClass");AlternativeUtility.start(rewardNameList);
}
public void doActivity(){
		StartClass obj=new StartClass();		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, "StartClass", mapReward);}}
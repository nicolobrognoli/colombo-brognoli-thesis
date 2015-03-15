
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper710{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper710(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.030422652868881083f);
mapReward.put("AtimeMax",0.03154296232611059f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.02557721224507309f);
mapReward.put("BtimeMax",0.03324325280653516f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09902871206365146f);
mapReward.put("CtimeMax",0.033137706032355496f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1297.26030066375f);
mapReward.put("AhMax",1295.9108784571113f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1290.6533721054793f);
mapReward.put("BhMax",1292.8874290503848f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1299.5909665076335f);
mapReward.put("ChMax",1292.8266638166795f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
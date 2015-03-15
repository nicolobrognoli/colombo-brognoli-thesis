
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper364{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper364(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08334204836768026f);
mapReward.put("AtimeMax",0.08211696586608183f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.055092335182564914f);
mapReward.put("BtimeMax",0.01767374124116241f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.001647844630803974f);
mapReward.put("CtimeMax",0.09852663336588532f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1641.0976592241404f);
mapReward.put("AhMax",1640.069402986119f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1640.569274310549f);
mapReward.put("BhMax",1645.6420007365116f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1641.838960466859f);
mapReward.put("ChMax",1645.9999682365492f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
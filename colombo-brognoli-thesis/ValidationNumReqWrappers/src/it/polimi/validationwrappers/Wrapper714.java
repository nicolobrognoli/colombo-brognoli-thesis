
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper714{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper714(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.012596662382603874f);
mapReward.put("AtimeMax",0.05420465360695054f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.05656391098965953f);
mapReward.put("BtimeMax",0.001649109195322873f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04566172941497113f);
mapReward.put("CtimeMax",0.060623481928629576f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1290.538742106364f);
mapReward.put("AhMax",1294.18077906527f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1291.1230594575165f);
mapReward.put("BhMax",1292.7551609055938f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1289.330633725413f);
mapReward.put("ChMax",1295.0219054827307f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
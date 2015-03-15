
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1472{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1472(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05002472536859569f);
mapReward.put("AtimeMax",0.08941679039038516f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.041383589445342775f);
mapReward.put("BtimeMax",0.002353689692790406f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08877463098309016f);
mapReward.put("CtimeMax",0.07776235423129282f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",536.6381572775946f);
mapReward.put("AhMax",536.3736135669828f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",534.3347639050429f);
mapReward.put("BhMax",530.9972711568838f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",537.5664616651221f);
mapReward.put("ChMax",534.0551006828327f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
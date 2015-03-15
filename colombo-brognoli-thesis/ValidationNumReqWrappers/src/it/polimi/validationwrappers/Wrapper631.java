
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper631{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper631(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03306193463816427f);
mapReward.put("AtimeMax",0.08630167971234678f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.056417637808410845f);
mapReward.put("BtimeMax",0.02283797286330308f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04620919904935866f);
mapReward.put("CtimeMax",0.0840111667974753f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1372.1755272425958f);
mapReward.put("AhMax",1370.0753046314471f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1370.108597208662f);
mapReward.put("BhMax",1374.2947156109021f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1372.7724908899713f);
mapReward.put("ChMax",1373.5707326242853f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1517{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1517(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.051219471707512676f);
mapReward.put("AtimeMax",0.09393179971461212f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.037912089888747426f);
mapReward.put("BtimeMax",0.07230935632919068f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.012858789005446713f);
mapReward.put("CtimeMax",0.05956539089456583f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",490.23169943309534f);
mapReward.put("AhMax",486.00149881463994f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",484.8834510729522f);
mapReward.put("BhMax",487.20823305265213f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",490.5877994760706f);
mapReward.put("ChMax",489.2835692494293f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
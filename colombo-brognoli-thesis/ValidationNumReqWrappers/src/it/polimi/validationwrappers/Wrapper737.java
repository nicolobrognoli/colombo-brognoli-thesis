
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper737{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper737(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04275219748927558f);
mapReward.put("AtimeMax",0.010622492460837263f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.030733770337408574f);
mapReward.put("BtimeMax",0.09998100636379662f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08989317779097407f);
mapReward.put("CtimeMax",0.016711714589007998f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1267.9963595773415f);
mapReward.put("AhMax",1272.2242438531541f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1264.3962296130362f);
mapReward.put("BhMax",1269.3182657001066f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1268.9493898370442f);
mapReward.put("ChMax",1263.9130384576235f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
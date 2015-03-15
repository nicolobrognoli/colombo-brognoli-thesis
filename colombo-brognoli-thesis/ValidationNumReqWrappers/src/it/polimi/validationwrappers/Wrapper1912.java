
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1912{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1912(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07032076377908794f);
mapReward.put("AtimeMax",0.08360434542434918f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.031605116869576934f);
mapReward.put("BtimeMax",0.07527352971706473f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07199748067029295f);
mapReward.put("CtimeMax",0.05424031499606221f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",88.30426593106911f);
mapReward.put("AhMax",88.25430242249756f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",89.85876133106966f);
mapReward.put("BhMax",88.89028396878453f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",94.5512361154886f);
mapReward.put("ChMax",90.49631081179315f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1043{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1043(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07749832845232085f);
mapReward.put("AtimeMax",0.057741148116615716f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.012028110025691208f);
mapReward.put("BtimeMax",0.08522214208347609f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.012187738628325572f);
mapReward.put("CtimeMax",0.09429244690979788f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",961.2962461533699f);
mapReward.put("AhMax",960.3507595087799f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",963.5663842786145f);
mapReward.put("BhMax",964.7412923163868f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",963.4424583363893f);
mapReward.put("ChMax",958.2366819652195f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
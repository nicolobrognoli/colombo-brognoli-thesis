
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1478{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1478(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05027200648035659f);
mapReward.put("AtimeMax",0.08609190687185805f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.09886263151745467f);
mapReward.put("BtimeMax",0.06197038596812056f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08655558671477744f);
mapReward.put("CtimeMax",0.08670681439567832f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",526.4536399908734f);
mapReward.put("AhMax",522.0461308984176f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",529.1736110273007f);
mapReward.put("BhMax",523.8306280170639f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",525.2017966222843f);
mapReward.put("ChMax",529.8709094390887f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
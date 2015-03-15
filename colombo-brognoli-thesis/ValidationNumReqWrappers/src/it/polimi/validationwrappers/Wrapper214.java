
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper214{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper214(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0019299603885491235f);
mapReward.put("AtimeMax",0.06488202800123903f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.039335279358883854f);
mapReward.put("BtimeMax",0.02063321860820704f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",1.448868538448389E-5f);
mapReward.put("CtimeMax",0.08954467009132762f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1786.4085761444824f);
mapReward.put("AhMax",1787.453545076278f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1787.5977955940032f);
mapReward.put("BhMax",1787.5889564246654f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1786.7600282432647f);
mapReward.put("ChMax",1794.4331436415114f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
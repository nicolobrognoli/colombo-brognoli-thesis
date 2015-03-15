
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper187{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper187(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07984654878404915f);
mapReward.put("AtimeMax",0.0611734853068933f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.019590225628357473f);
mapReward.put("BtimeMax",0.05917017432580731f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.014246924487443935f);
mapReward.put("CtimeMax",0.005533129766101053f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1818.309695114009f);
mapReward.put("AhMax",1821.8305584858936f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1814.4393164179155f);
mapReward.put("BhMax",1819.4374362960903f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1820.0198213128592f);
mapReward.put("ChMax",1820.7826195515017f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
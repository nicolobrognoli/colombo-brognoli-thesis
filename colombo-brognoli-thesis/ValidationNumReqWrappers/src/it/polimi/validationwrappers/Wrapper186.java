
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper186{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper186(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09973253025158818f);
mapReward.put("AtimeMax",0.058988704840671466f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.007713270609734824f);
mapReward.put("BtimeMax",0.022487735575793488f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05796325693406098f);
mapReward.put("CtimeMax",0.009769581376498726f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1820.5752706686064f);
mapReward.put("AhMax",1821.529244028486f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1822.879199984894f);
mapReward.put("BhMax",1818.2514975829747f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1818.0015064211861f);
mapReward.put("ChMax",1818.2488413112342f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
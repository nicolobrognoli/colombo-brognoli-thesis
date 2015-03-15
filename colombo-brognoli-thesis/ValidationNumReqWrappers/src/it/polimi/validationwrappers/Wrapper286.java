
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper286{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper286(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.030151652593655886f);
mapReward.put("AtimeMax",0.04910262660554071f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.025099091508078698f);
mapReward.put("BtimeMax",0.09985429354774658f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05923481770290388f);
mapReward.put("CtimeMax",0.03384907730273f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1719.1433178866394f);
mapReward.put("AhMax",1714.7534776687357f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1723.3829917416863f);
mapReward.put("BhMax",1715.148492991026f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1722.1677966870213f);
mapReward.put("ChMax",1717.200957183088f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
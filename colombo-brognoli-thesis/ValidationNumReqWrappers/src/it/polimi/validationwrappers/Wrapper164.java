
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper164{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper164(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07045259445746489f);
mapReward.put("AtimeMax",0.04831613830732832f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",6.240841741756098E-4f);
mapReward.put("BtimeMax",0.0862401249617241f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.039414266546948594f);
mapReward.put("CtimeMax",0.0966055652931613f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1844.7830972203033f);
mapReward.put("AhMax",1838.7589322140427f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1836.1576594776006f);
mapReward.put("BhMax",1839.9497480355658f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1843.11162400782f);
mapReward.put("ChMax",1837.9766347758173f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
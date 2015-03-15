
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper116{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper116(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04399019967594818f);
mapReward.put("AtimeMax",0.08975031788446766f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.027457715808562932f);
mapReward.put("BtimeMax",0.04382417597912278f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05977270033898613f);
mapReward.put("CtimeMax",0.03131344865539637f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1893.5691198389611f);
mapReward.put("AhMax",1886.885050674444f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1885.741346075797f);
mapReward.put("BhMax",1887.4225753421547f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1892.4939735882288f);
mapReward.put("ChMax",1893.799395458833f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
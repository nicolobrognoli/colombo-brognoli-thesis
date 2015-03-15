
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper70{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper70(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09564020829619167f);
mapReward.put("AtimeMax",0.08078866896471522f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.052075853649685366f);
mapReward.put("BtimeMax",0.0823590992012826f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0799730439087188f);
mapReward.put("CtimeMax",0.07888988379929276f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1936.3919641015975f);
mapReward.put("AhMax",1931.8367596090534f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1937.5982026436172f);
mapReward.put("BhMax",1936.2199117845814f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1932.7005215354327f);
mapReward.put("ChMax",1934.5873475760025f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
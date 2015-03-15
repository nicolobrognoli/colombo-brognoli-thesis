
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper201{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper201(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08754774918383869f);
mapReward.put("AtimeMax",0.0271854650345155f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.02809520403643041f);
mapReward.put("BtimeMax",0.08863345107342298f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09929280754753451f);
mapReward.put("CtimeMax",0.0018948765235641484f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1807.9697171336359f);
mapReward.put("AhMax",1807.8830158103503f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1802.2737242093315f);
mapReward.put("BhMax",1801.4767472857732f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1799.9518046511957f);
mapReward.put("ChMax",1801.5108367769783f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
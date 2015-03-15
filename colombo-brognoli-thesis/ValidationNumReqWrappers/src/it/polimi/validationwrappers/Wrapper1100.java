
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1100{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1100(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08021950702563374f);
mapReward.put("AtimeMax",0.02766422896330991f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.013802940710822987f);
mapReward.put("BtimeMax",0.03503071729700387f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07994564552351192f);
mapReward.put("CtimeMax",0.07405464009908888f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",901.8520148107813f);
mapReward.put("AhMax",904.800747163723f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",908.2085269193715f);
mapReward.put("BhMax",906.0842723154107f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",901.6850676123314f);
mapReward.put("ChMax",907.118294015552f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
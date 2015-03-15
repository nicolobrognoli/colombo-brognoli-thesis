
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper824{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper824(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05352587790508538f);
mapReward.put("AtimeMax",0.07633181936171227f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.019029200785991972f);
mapReward.put("BtimeMax",0.06433289674838297f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03489224639753401f);
mapReward.put("CtimeMax",0.008937779601870676f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1181.9523549877492f);
mapReward.put("AhMax",1180.4969362610932f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1181.6107295012769f);
mapReward.put("BhMax",1184.078489535036f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1183.50676508139f);
mapReward.put("ChMax",1178.4123766934438f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
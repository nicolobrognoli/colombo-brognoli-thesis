
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1314{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1314(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07708922219971015f);
mapReward.put("AtimeMax",0.04278933147385968f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.038197928543838564f);
mapReward.put("BtimeMax",7.818998626654361E-4f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06838897432052887f);
mapReward.put("CtimeMax",0.0020115586985271607f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",688.6919488447227f);
mapReward.put("AhMax",687.1406505608408f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",689.5963423283317f);
mapReward.put("BhMax",690.8823627781062f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",687.2260309630767f);
mapReward.put("ChMax",691.3853645152407f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1545{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1545(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.00741209946288659f);
mapReward.put("AtimeMax",0.00450141214736578f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.039239702265964946f);
mapReward.put("BtimeMax",0.031821113552425596f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06093095073911694f);
mapReward.put("CtimeMax",0.03806947139308745f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",459.40585173217886f);
mapReward.put("AhMax",457.82220655807754f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",463.1780390204463f);
mapReward.put("BhMax",457.5808311310312f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",464.4298447230318f);
mapReward.put("ChMax",458.4661818026947f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
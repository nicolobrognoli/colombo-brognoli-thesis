
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1077{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1077(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09447281718526028f);
mapReward.put("AtimeMax",0.016383114539178577f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.008295272710826052f);
mapReward.put("BtimeMax",0.023720194133701522f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.027552731367309635f);
mapReward.put("CtimeMax",0.039606932556802046f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",923.0047652670772f);
mapReward.put("AhMax",923.2940049826524f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",926.0782169611426f);
mapReward.put("BhMax",924.3127329456121f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",931.5008077665245f);
mapReward.put("ChMax",927.7951138844148f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
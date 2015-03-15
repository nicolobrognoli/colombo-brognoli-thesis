
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1164{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1164(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07744650852096571f);
mapReward.put("AtimeMax",0.005664445827501974f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.009175744058250456f);
mapReward.put("BtimeMax",0.07652940077336584f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05781767990512056f);
mapReward.put("CtimeMax",0.04588405030459312f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",841.5711465731829f);
mapReward.put("AhMax",841.4601642910002f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",840.071456181733f);
mapReward.put("BhMax",842.6594399508555f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",841.0546795243666f);
mapReward.put("ChMax",843.9110574716443f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
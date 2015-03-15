
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1221{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1221(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0626960291593664f);
mapReward.put("AtimeMax",0.0706416841156379f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.011953506710398997f);
mapReward.put("BtimeMax",0.05833452497981426f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.028041275366137874f);
mapReward.put("CtimeMax",0.06523249437757153f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",782.8931742239586f);
mapReward.put("AhMax",784.2276420240439f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",784.6956035306769f);
mapReward.put("BhMax",781.605261912223f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",788.417372174275f);
mapReward.put("ChMax",787.867788885364f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper328{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper328(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0994186270816245f);
mapReward.put("AtimeMax",0.01061383503990061f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.010224052863325584f);
mapReward.put("BtimeMax",0.037130267772826096f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08793609139707279f);
mapReward.put("CtimeMax",0.03628943681564199f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1675.1482872319723f);
mapReward.put("AhMax",1678.8652420108085f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1672.2935577671785f);
mapReward.put("BhMax",1679.3697215430236f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1672.2406093406269f);
mapReward.put("ChMax",1675.0436497587764f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
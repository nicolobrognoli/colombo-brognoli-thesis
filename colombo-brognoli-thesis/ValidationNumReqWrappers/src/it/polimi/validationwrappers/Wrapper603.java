
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper603{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper603(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04770246939828319f);
mapReward.put("AtimeMax",0.06744405373959088f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.020817134759093116f);
mapReward.put("BtimeMax",0.01491096961666919f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02530099881090131f);
mapReward.put("CtimeMax",0.052635579199646586f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1405.8703256812496f);
mapReward.put("AhMax",1404.1660826390107f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1397.6161935693979f);
mapReward.put("BhMax",1397.6757748472685f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1406.6328234490825f);
mapReward.put("ChMax",1397.1885583975727f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
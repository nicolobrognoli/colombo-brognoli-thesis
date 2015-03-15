
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1387{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1387(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09716074709634544f);
mapReward.put("AtimeMax",0.0926029380634812f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",5.335727571434302E-4f);
mapReward.put("BtimeMax",0.05051782635241564f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.028799138425398628f);
mapReward.put("CtimeMax",0.08836599149549429f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",618.494954457325f);
mapReward.put("AhMax",616.7302039150019f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",615.2095358380575f);
mapReward.put("BhMax",619.9922793765182f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",614.124845223875f);
mapReward.put("ChMax",619.8659137678505f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
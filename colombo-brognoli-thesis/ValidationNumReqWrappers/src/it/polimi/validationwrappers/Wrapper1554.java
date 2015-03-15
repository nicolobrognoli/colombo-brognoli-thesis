
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1554{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1554(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09583836195508921f);
mapReward.put("AtimeMax",0.08555257990773188f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.063995255652093f);
mapReward.put("BtimeMax",0.09187264537950102f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0541498295560789f);
mapReward.put("CtimeMax",0.04652140903412435f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",453.96493744839944f);
mapReward.put("AhMax",455.2460534086325f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",449.39563799488565f);
mapReward.put("BhMax",446.49676216961365f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",449.58766834366446f);
mapReward.put("ChMax",450.55857349161755f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
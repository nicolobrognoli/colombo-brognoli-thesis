
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper550{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper550(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07076897967539177f);
mapReward.put("AtimeMax",0.06552222045629587f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.041720237255539916f);
mapReward.put("BtimeMax",0.03530293040397971f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08555576438005857f);
mapReward.put("CtimeMax",0.03178716959450213f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1457.5486232879102f);
mapReward.put("AhMax",1453.8227706331795f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1459.2200134970358f);
mapReward.put("BhMax",1453.692004784435f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1452.6456025523341f);
mapReward.put("ChMax",1456.3399615566332f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
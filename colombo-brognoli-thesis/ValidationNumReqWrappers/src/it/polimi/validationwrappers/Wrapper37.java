
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper37{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper37(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03397666228473002f);
mapReward.put("AtimeMax",0.08443091797494466f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.002869680037083078f);
mapReward.put("BtimeMax",0.09942986325596259f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04043711672773102f);
mapReward.put("CtimeMax",0.010878216871347334f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1971.1707521792669f);
mapReward.put("AhMax",1967.9192940699802f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1963.1478951775935f);
mapReward.put("BhMax",1972.7645348503354f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1965.3437225511154f);
mapReward.put("ChMax",1971.2183810226347f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
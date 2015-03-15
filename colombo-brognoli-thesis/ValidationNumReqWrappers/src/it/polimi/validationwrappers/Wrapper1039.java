
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1039{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1039(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.029818953355571377f);
mapReward.put("AtimeMax",0.020205194125754646f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.046795197830124514f);
mapReward.put("BtimeMax",0.03928291772488076f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.029712009545873164f);
mapReward.put("CtimeMax",0.05790815809212742f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",965.9317737720881f);
mapReward.put("AhMax",967.0547876285823f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",964.171456470337f);
mapReward.put("BhMax",963.6922756608421f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",962.2628477798496f);
mapReward.put("ChMax",962.3622539454224f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
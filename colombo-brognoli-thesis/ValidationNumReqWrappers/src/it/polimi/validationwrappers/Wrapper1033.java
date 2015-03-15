
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1033{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1033(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05729010006721258f);
mapReward.put("AtimeMax",0.059376899332607445f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.037291270930021624f);
mapReward.put("BtimeMax",0.0938167420819656f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08801506212385177f);
mapReward.put("CtimeMax",0.0018211154366822636f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",974.9003183665338f);
mapReward.put("AhMax",973.334999205684f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",969.4311756641915f);
mapReward.put("BhMax",975.2958604652077f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",973.5455546852933f);
mapReward.put("ChMax",972.0823028043094f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
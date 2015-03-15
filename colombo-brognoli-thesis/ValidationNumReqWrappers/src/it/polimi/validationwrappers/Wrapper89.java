
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper89{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper89(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07383678954798895f);
mapReward.put("AtimeMax",0.03142025154313004f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.016111108157369346f);
mapReward.put("BtimeMax",0.014001215529430256f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.060272791090965505f);
mapReward.put("CtimeMax",0.062400756711644446f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1913.606989097695f);
mapReward.put("AhMax",1919.6558808795542f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1919.2364154940715f);
mapReward.put("BhMax",1916.9347488384647f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1913.4611796349625f);
mapReward.put("ChMax",1912.7483474193298f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
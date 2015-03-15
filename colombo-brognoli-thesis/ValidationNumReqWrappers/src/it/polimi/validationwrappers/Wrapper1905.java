
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1905{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1905(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04229752226816045f);
mapReward.put("AtimeMax",0.07060773000682612f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.058675496676339825f);
mapReward.put("BtimeMax",0.08191223691590208f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.051361189465259506f);
mapReward.put("CtimeMax",0.001122102522030355f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",96.5272548714113f);
mapReward.put("AhMax",97.12365920786651f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",102.60977163710156f);
mapReward.put("BhMax",99.71166513432372f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",104.26173171386391f);
mapReward.put("ChMax",99.90565438162167f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
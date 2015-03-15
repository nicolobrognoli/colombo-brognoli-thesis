
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper913{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper913(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05721024511487016f);
mapReward.put("AtimeMax",0.06865063118859827f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.019108172090881448f);
mapReward.put("BtimeMax",0.05461981371540599f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.032663127643867175f);
mapReward.put("CtimeMax",0.07125646678386531f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1094.226862153747f);
mapReward.put("AhMax",1094.0955632288285f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1091.1637929669696f);
mapReward.put("BhMax",1093.509037496509f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1092.5136678280226f);
mapReward.put("ChMax",1091.0021916712824f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1191{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1191(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.037676051536632116f);
mapReward.put("AtimeMax",0.0713703505701266f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.06780094538552375f);
mapReward.put("BtimeMax",0.04701293702801369f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07349557748978691f);
mapReward.put("CtimeMax",0.09091104799962067f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",818.8345171287662f);
mapReward.put("AhMax",811.4952661741733f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",813.6042815624519f);
mapReward.put("BhMax",811.0150274324786f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",814.4958800578439f);
mapReward.put("ChMax",811.6058998232292f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
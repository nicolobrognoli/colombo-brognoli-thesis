
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper611{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper611(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.019142188509869096f);
mapReward.put("AtimeMax",0.06154648883985124f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.022701857849336936f);
mapReward.put("BtimeMax",0.096954377030534f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09338191142805922f);
mapReward.put("CtimeMax",0.08616457733930062f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1393.7135475764221f);
mapReward.put("AhMax",1391.4713340921378f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1398.458565926685f);
mapReward.put("BhMax",1389.1218537258349f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1389.0126044875815f);
mapReward.put("ChMax",1396.7382015188184f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1724{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1724(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.029842198520065578f);
mapReward.put("AtimeMax",0.014401505384173008f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.005469567600317959f);
mapReward.put("BtimeMax",0.06035786120102005f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06744919917191303f);
mapReward.put("CtimeMax",0.09822779750372992f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",278.45114442418196f);
mapReward.put("AhMax",283.4473921031212f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",279.00567015124017f);
mapReward.put("BhMax",282.6743037500434f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",282.3162205413835f);
mapReward.put("ChMax",281.0316390431738f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
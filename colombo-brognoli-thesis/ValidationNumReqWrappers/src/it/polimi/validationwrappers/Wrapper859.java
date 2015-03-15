
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper859{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper859(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.007617912544731686f);
mapReward.put("AtimeMax",0.04223573065116265f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.002551496357277161f);
mapReward.put("BtimeMax",0.042031371682615414f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.040849521767269914f);
mapReward.put("CtimeMax",0.021669211498082964f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1142.8653454910973f);
mapReward.put("AhMax",1143.6844957631993f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1149.6986980980284f);
mapReward.put("BhMax",1149.3857340471825f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1150.203321183883f);
mapReward.put("ChMax",1147.5479416541689f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
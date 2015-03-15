
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper937{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper937(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06459512398987058f);
mapReward.put("AtimeMax",0.04958716432971595f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.042606085988138066f);
mapReward.put("BtimeMax",0.02066604434017414f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08239938736889513f);
mapReward.put("CtimeMax",0.08423052616599416f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1064.3531933342247f);
mapReward.put("AhMax",1064.4650081254024f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1064.15208556378f);
mapReward.put("BhMax",1065.64783822888f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1071.6380754712995f);
mapReward.put("ChMax",1067.0860563073734f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
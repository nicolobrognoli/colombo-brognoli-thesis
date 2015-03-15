
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper563{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper563(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.057502004144146926f);
mapReward.put("AtimeMax",0.0537555484710571f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.06664279132064978f);
mapReward.put("BtimeMax",0.0189634750987032f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09062641058556825f);
mapReward.put("CtimeMax",0.03910924348007148f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1439.3015342538065f);
mapReward.put("AhMax",1441.0622743918518f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1438.105753735602f);
mapReward.put("BhMax",1442.053472246495f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1444.5801800638294f);
mapReward.put("ChMax",1445.1162796637632f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
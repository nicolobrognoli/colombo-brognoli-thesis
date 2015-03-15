
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1692{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1692(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.037245771291207944f);
mapReward.put("AtimeMax",0.06286017641672989f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.04051058040610839f);
mapReward.put("BtimeMax",0.04137441253445787f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.020950692639723312f);
mapReward.put("CtimeMax",0.07273038625688329f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",316.5575319958135f);
mapReward.put("AhMax",308.954021422208f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",311.79753579152805f);
mapReward.put("BhMax",314.7573621912642f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",308.4007597415801f);
mapReward.put("ChMax",313.7607801445832f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
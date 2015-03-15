
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper846{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper846(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04577483806955559f);
mapReward.put("AtimeMax",0.08519883892989857f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.037596518221025964f);
mapReward.put("BtimeMax",0.0830887042906354f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06566316501605489f);
mapReward.put("CtimeMax",0.08382492560880848f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1159.4657875659473f);
mapReward.put("AhMax",1161.2216909017181f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1156.531240496189f);
mapReward.put("BhMax",1160.4008323122728f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1155.496316118361f);
mapReward.put("ChMax",1162.3513466102877f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1213{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1213(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05794136557949747f);
mapReward.put("AtimeMax",0.085813460959305f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.054810753776698376f);
mapReward.put("BtimeMax",0.01959157906812854f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.006777815641184804f);
mapReward.put("CtimeMax",0.053668652230147086f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",795.2256227831025f);
mapReward.put("AhMax",794.9473875887961f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",793.6753146678215f);
mapReward.put("BhMax",796.4058303138893f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",794.9406891344362f);
mapReward.put("ChMax",788.2669931048982f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
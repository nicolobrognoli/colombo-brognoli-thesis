
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper928{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper928(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08299093936509985f);
mapReward.put("AtimeMax",0.04253090301415008f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.07362321028448902f);
mapReward.put("BtimeMax",0.06970851417054943f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04096336616004183f);
mapReward.put("CtimeMax",0.03936056875225282f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1078.1707976798814f);
mapReward.put("AhMax",1081.6790294545087f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1079.853287706439f);
mapReward.put("BhMax",1080.4079342286495f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1072.7424149088777f);
mapReward.put("ChMax",1080.5564445565556f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
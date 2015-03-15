
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper858{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper858(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06224021435424193f);
mapReward.put("AtimeMax",0.07181701965410023f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.058148391487487704f);
mapReward.put("BtimeMax",0.057729551256731626f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.025060503507913123f);
mapReward.put("CtimeMax",0.03038034209406306f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1149.6796981017558f);
mapReward.put("AhMax",1149.819884888898f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1147.8378688997145f);
mapReward.put("BhMax",1148.7246934554923f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1145.6666667894976f);
mapReward.put("ChMax",1148.6983559688674f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
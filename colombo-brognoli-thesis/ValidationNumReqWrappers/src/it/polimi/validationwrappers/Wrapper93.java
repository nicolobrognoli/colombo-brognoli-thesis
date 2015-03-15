
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper93{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper93(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06478736473228393f);
mapReward.put("AtimeMax",0.03487178448437596f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.01253449709345974f);
mapReward.put("BtimeMax",0.03304908507390952f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.024491538897534748f);
mapReward.put("CtimeMax",0.0400973458499268f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1916.7965933121566f);
mapReward.put("AhMax",1914.8236901711825f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1908.199124782384f);
mapReward.put("BhMax",1915.3817466047494f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1908.4304682260613f);
mapReward.put("ChMax",1911.200160015584f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
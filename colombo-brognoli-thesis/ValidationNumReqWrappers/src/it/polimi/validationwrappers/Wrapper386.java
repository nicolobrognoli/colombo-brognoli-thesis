
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper386{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper386(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0031232509603937864f);
mapReward.put("AtimeMax",0.013210760765777773f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.05770707376572848f);
mapReward.put("BtimeMax",0.04731588029569507f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.056027001479205044f);
mapReward.put("CtimeMax",0.019669465038050227f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1618.9087071408535f);
mapReward.put("AhMax",1618.6797469994801f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1614.6926108058576f);
mapReward.put("BhMax",1623.2043925687105f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1615.6865860669295f);
mapReward.put("ChMax",1615.7694600201726f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
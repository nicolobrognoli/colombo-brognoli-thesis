
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1566{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1566(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.057638215057472755f);
mapReward.put("AtimeMax",0.016952309041886916f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.004329685103614489f);
mapReward.put("BtimeMax",0.07523391338097181f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03594423307192611f);
mapReward.put("CtimeMax",0.0738094665975563f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",435.80482424871786f);
mapReward.put("AhMax",442.4648986936679f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",438.0729819271279f);
mapReward.put("BhMax",436.26231218187297f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",442.23039248900017f);
mapReward.put("ChMax",435.5590948473106f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
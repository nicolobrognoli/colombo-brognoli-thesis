
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1998{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1998(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09559801630295141f);
mapReward.put("AtimeMax",0.007961018241487839f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.045221623680043885f);
mapReward.put("BtimeMax",0.007961570893985203f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02669932431719122f);
mapReward.put("CtimeMax",0.015575965724180274f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",7.121504423829993f);
mapReward.put("AhMax",11.344514360533179f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",5.866642209929028f);
mapReward.put("BhMax",5.75217009243663f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",3.1302396903966416f);
mapReward.put("ChMax",3.71402582366166f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
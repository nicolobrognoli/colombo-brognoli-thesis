
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1870{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1870(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06487081459640451f);
mapReward.put("AtimeMax",0.022028034118079066f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.013384153484632155f);
mapReward.put("BtimeMax",9.42072533313787E-4f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08503111997904378f);
mapReward.put("CtimeMax",0.08004716034083688f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",134.27749535378587f);
mapReward.put("AhMax",138.5729407259329f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",133.4272531548492f);
mapReward.put("BhMax",131.41845845694615f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",132.6697332857915f);
mapReward.put("ChMax",133.05235881807772f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1238{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1238(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.003826123003266968f);
mapReward.put("AtimeMax",0.04389554569059623f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.003533389831122824f);
mapReward.put("BtimeMax",0.0070862704442198f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07972724885244023f);
mapReward.put("CtimeMax",0.03435727161305093f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",762.2723132317329f);
mapReward.put("AhMax",768.9313824276803f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",771.0684711654562f);
mapReward.put("BhMax",768.052223277803f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",763.2841790982798f);
mapReward.put("ChMax",770.3085667598688f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
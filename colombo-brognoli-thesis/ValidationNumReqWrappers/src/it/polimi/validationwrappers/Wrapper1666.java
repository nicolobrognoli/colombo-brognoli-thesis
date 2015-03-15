
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1666{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1666(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05737681795782679f);
mapReward.put("AtimeMax",0.09461631181733252f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.010002764727771651f);
mapReward.put("BtimeMax",0.042547126888233235f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08087685075809978f);
mapReward.put("CtimeMax",0.027126390798234035f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",342.4399322024024f);
mapReward.put("AhMax",343.70362597758196f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",335.81378676010485f);
mapReward.put("BhMax",340.1269885017301f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",339.55695918573144f);
mapReward.put("ChMax",340.7407875168175f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1144{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1144(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05011031995516576f);
mapReward.put("AtimeMax",0.03852810441722423f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.08970037379499618f);
mapReward.put("BtimeMax",0.021262688724899635f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",9.498516315922245E-4f);
mapReward.put("CtimeMax",0.011509651292482126f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",865.9063634668664f);
mapReward.put("AhMax",863.6670080732003f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",861.0907922800593f);
mapReward.put("BhMax",859.2987912037275f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",859.2745985936888f);
mapReward.put("ChMax",862.9720596239256f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
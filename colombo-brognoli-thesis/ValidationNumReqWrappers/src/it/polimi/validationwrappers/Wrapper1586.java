
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1586{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1586(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05630761850879359f);
mapReward.put("AtimeMax",0.07972717297439216f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.039097137051651264f);
mapReward.put("BtimeMax",0.03465095998766806f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.00822266735911461f);
mapReward.put("CtimeMax",0.03516018438347858f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",420.4449309960075f);
mapReward.put("AhMax",418.9701580555332f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",414.7239434543894f);
mapReward.put("BhMax",415.2769921966743f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",420.99408436939717f);
mapReward.put("ChMax",416.2265265476043f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
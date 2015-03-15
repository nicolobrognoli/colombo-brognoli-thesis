
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper978{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper978(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05330727253156657f);
mapReward.put("AtimeMax",0.03680662043020575f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.011171911460200657f);
mapReward.put("BtimeMax",0.01943126000852139f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.030207042832349894f);
mapReward.put("CtimeMax",0.055219923604674835f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1031.4854244286694f);
mapReward.put("AhMax",1024.6823302000016f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1030.0767865011917f);
mapReward.put("BhMax",1031.9275124672733f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1031.2774860934403f);
mapReward.put("ChMax",1022.3833082495867f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1021{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1021(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.018012489522720988f);
mapReward.put("AtimeMax",0.08050468936738418f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.024148517353900622f);
mapReward.put("BtimeMax",0.07142773790650937f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.008640280612347196f);
mapReward.put("CtimeMax",0.022443778847765782f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",979.8095938734917f);
mapReward.put("AhMax",986.1078400204702f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",986.5197920744446f);
mapReward.put("BhMax",985.9301268666178f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",982.2525278204461f);
mapReward.put("ChMax",984.9721051862891f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
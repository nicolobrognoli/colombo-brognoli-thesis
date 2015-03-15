
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1818{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1818(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09204668302744086f);
mapReward.put("AtimeMax",0.058555375157441955f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.025722516875088242f);
mapReward.put("BtimeMax",0.01113393370781247f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0325888318399436f);
mapReward.put("CtimeMax",0.020469813586929876f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",189.65448420383365f);
mapReward.put("AhMax",186.588715632612f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",190.53874582161748f);
mapReward.put("BhMax",185.75414249575184f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",187.88546220668005f);
mapReward.put("ChMax",186.2785019078088f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
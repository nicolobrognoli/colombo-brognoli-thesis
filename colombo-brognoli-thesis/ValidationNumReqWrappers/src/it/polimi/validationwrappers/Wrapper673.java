
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper673{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper673(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.035450603534945294f);
mapReward.put("AtimeMax",0.0457617559059566f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.085584204484525f);
mapReward.put("BtimeMax",0.0030338973142576275f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.033485663358978957f);
mapReward.put("CtimeMax",0.03827325728524612f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1329.7309709296837f);
mapReward.put("AhMax",1328.2282115335438f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1329.6447360365696f);
mapReward.put("BhMax",1327.8648345341248f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1332.4360595002765f);
mapReward.put("ChMax",1327.2760516881983f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
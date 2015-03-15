
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper601{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper601(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06840375959172766f);
mapReward.put("AtimeMax",0.045827423999136155f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.017287626023195946f);
mapReward.put("BtimeMax",0.09329710790757376f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.011028962334845727f);
mapReward.put("CtimeMax",0.016444158705273472f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1401.5865402627255f);
mapReward.put("AhMax",1407.2441533108833f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1405.9150813539861f);
mapReward.put("BhMax",1404.8175191365012f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1408.575667694328f);
mapReward.put("ChMax",1402.4537547618786f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
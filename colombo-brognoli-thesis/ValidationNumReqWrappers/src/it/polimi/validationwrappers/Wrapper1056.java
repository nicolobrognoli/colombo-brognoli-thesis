
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1056{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1056(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03901074869460974f);
mapReward.put("AtimeMax",0.008024974093116356f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.060123142868046986f);
mapReward.put("BtimeMax",0.0855392792442432f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04137039649906157f);
mapReward.put("CtimeMax",0.0433071406894596f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",951.0050084711359f);
mapReward.put("AhMax",944.6423087424239f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",952.5777539837316f);
mapReward.put("BhMax",947.8852459437417f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",946.7710554536809f);
mapReward.put("ChMax",944.5678640246521f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
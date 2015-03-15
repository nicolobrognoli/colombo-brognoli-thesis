
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1622{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1622(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07448526245138541f);
mapReward.put("AtimeMax",0.06484084365474747f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.037379110209918485f);
mapReward.put("BtimeMax",0.08505791237823584f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03471499753852701f);
mapReward.put("CtimeMax",0.07275984166138008f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",380.7656857453189f);
mapReward.put("AhMax",384.7198028097818f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",387.0654781583398f);
mapReward.put("BhMax",383.46228829822394f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",381.04622451513643f);
mapReward.put("ChMax",387.5078564815173f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
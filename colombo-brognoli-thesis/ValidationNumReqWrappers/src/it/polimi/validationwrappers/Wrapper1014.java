
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1014{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1014(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.025272897339064647f);
mapReward.put("AtimeMax",0.07702405811759118f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.062338379859663805f);
mapReward.put("BtimeMax",0.08551043348547971f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0022489618833651305f);
mapReward.put("CtimeMax",0.023071593305000616f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",994.0236829623044f);
mapReward.put("AhMax",989.7253780176364f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",995.9168263236628f);
mapReward.put("BhMax",988.2357815195993f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",986.5299810611212f);
mapReward.put("ChMax",991.5532446226072f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
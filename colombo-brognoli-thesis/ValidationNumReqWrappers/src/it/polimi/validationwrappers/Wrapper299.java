
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper299{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper299(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.014466489596704536f);
mapReward.put("AtimeMax",0.09209957791152004f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.049650032930669996f);
mapReward.put("BtimeMax",0.014101623798935392f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0740879445962159f);
mapReward.put("CtimeMax",0.04513674659720953f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1707.1342338063512f);
mapReward.put("AhMax",1705.6402545775704f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1707.755028572554f);
mapReward.put("BhMax",1710.2049225278238f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1704.6898315317792f);
mapReward.put("ChMax",1709.5921363939483f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
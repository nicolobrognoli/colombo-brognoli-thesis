
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1691{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1691(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.061677880857385126f);
mapReward.put("AtimeMax",0.07147702925115751f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",1.9955640188822342E-4f);
mapReward.put("BtimeMax",0.018235379076075964f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.015575377058684493f);
mapReward.put("CtimeMax",0.017255627685852103f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",315.7115978365518f);
mapReward.put("AhMax",318.2896410032673f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",317.7837361713926f);
mapReward.put("BhMax",312.8773878301119f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",318.51739864652836f);
mapReward.put("ChMax",318.53210649969304f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1903{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1903(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08767346653401914f);
mapReward.put("AtimeMax",0.07347477205977923f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",6.905412504634167E-5f);
mapReward.put("BtimeMax",0.06142930072983301f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.052498739370336146f);
mapReward.put("CtimeMax",0.014586214804829934f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",102.8471678245635f);
mapReward.put("AhMax",100.98086063540643f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",100.83775106077054f);
mapReward.put("BhMax",106.52296990645199f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",101.3444835920817f);
mapReward.put("ChMax",106.17497047401149f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
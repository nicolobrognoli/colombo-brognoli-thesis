
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1488{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1488(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07559105939290818f);
mapReward.put("AtimeMax",0.08803516825938165f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.016107508244336044f);
mapReward.put("BtimeMax",0.07376680685422675f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04441523311366384f);
mapReward.put("CtimeMax",0.016835722625756566f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",519.2365869076039f);
mapReward.put("AhMax",514.382580724958f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",514.5529319171767f);
mapReward.put("BhMax",521.1305874565268f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",513.6868859366035f);
mapReward.put("ChMax",517.8381126153402f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
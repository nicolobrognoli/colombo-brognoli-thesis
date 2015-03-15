
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1650{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1650(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04793140945063844f);
mapReward.put("AtimeMax",0.07733855113690544f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.038862314116943894f);
mapReward.put("BtimeMax",0.012513756011960942f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0812431965796723f);
mapReward.put("CtimeMax",0.04318402552688322f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",359.49813351610504f);
mapReward.put("AhMax",356.5760181609054f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",358.0394988267192f);
mapReward.put("BhMax",353.4744140191846f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",359.1427031697229f);
mapReward.put("ChMax",359.7975825729975f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
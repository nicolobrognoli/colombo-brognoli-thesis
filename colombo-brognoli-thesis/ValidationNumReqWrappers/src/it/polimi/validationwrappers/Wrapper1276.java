
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1276{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1276(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07352397732866416f);
mapReward.put("AtimeMax",0.09947926125022094f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.052616473471301016f);
mapReward.put("BtimeMax",0.08606370724194136f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04046561919849122f);
mapReward.put("CtimeMax",0.06765626556334178f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",727.8384899931496f);
mapReward.put("AhMax",726.6350099645534f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",725.9285366213444f);
mapReward.put("BhMax",730.2228533914924f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",728.4615898888843f);
mapReward.put("ChMax",726.2578297785559f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
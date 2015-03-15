
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1652{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1652(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.007159572862255392f);
mapReward.put("AtimeMax",0.026106704088916223f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",5.368003113772168E-4f);
mapReward.put("BtimeMax",0.020560925939464403f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07713789736094409f);
mapReward.put("CtimeMax",0.020141139144251752f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",349.8368631888152f);
mapReward.put("AhMax",354.04821163643874f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",356.5339657652131f);
mapReward.put("BhMax",355.3102105041649f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",354.0251673569223f);
mapReward.put("ChMax",349.0247981870677f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
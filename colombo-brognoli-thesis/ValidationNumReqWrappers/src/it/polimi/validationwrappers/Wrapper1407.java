
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1407{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1407(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06519798800904944f);
mapReward.put("AtimeMax",0.06772533106207705f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.057419872647696414f);
mapReward.put("BtimeMax",0.06547870690776258f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01941007099804263f);
mapReward.put("CtimeMax",0.05510773174814718f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",593.5146547014567f);
mapReward.put("AhMax",602.6360672353936f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",597.3163680081943f);
mapReward.put("BhMax",594.2868025667f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",594.0303363211926f);
mapReward.put("ChMax",602.0981037958253f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper21{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper21(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04480102078872476f);
mapReward.put("AtimeMax",0.028194856281078172f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.034223332382059976f);
mapReward.put("BtimeMax",0.07659874552651696f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05878208174590419f);
mapReward.put("CtimeMax",0.02415619363014382f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1987.0301136781259f);
mapReward.put("AhMax",1985.9783503147482f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1980.767784621419f);
mapReward.put("BhMax",1981.4114364323375f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1979.2435193219255f);
mapReward.put("ChMax",1983.5607271899898f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
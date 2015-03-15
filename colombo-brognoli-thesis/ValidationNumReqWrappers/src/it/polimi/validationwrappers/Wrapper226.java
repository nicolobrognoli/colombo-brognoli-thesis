
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper226{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper226(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08450257881021536f);
mapReward.put("AtimeMax",0.05245435120317064f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.03432445316116831f);
mapReward.put("BtimeMax",0.00921088767687972f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08747560818020461f);
mapReward.put("CtimeMax",0.06704379204808439f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1782.3980928412022f);
mapReward.put("AhMax",1783.7900297373767f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1779.0179542736694f);
mapReward.put("BhMax",1779.7753748484079f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1776.661627260756f);
mapReward.put("ChMax",1777.8241374600161f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
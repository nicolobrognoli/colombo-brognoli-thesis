
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1321{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1321(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0696387970757037f);
mapReward.put("AtimeMax",0.05832013510173768f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.083407178898732f);
mapReward.put("BtimeMax",0.06699814806204099f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0969999798610901f);
mapReward.put("CtimeMax",0.07121068089584742f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",681.1625810819609f);
mapReward.put("AhMax",682.1485452617688f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",679.3921719481172f);
mapReward.put("BhMax",682.1332419542846f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",682.1766825734383f);
mapReward.put("ChMax",687.5210244646311f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
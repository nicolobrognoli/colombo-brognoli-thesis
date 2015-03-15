
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper158{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper158(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08335857649217936f);
mapReward.put("AtimeMax",0.08550172122697659f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.08676718861765736f);
mapReward.put("BtimeMax",0.029309826483457157f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.058287579386844444f);
mapReward.put("CtimeMax",0.07008402543045508f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1850.4414323867006f);
mapReward.put("AhMax",1846.4047414042352f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1842.5314461885564f);
mapReward.put("BhMax",1848.7067812535142f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1844.2392125311194f);
mapReward.put("ChMax",1851.026459344072f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
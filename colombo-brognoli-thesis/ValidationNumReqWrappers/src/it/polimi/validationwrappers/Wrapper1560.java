
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1560{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1560(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0922088038008258f);
mapReward.put("AtimeMax",0.029518649329412415f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.061968511458798003f);
mapReward.put("BtimeMax",0.09061622576727045f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07943050401121085f);
mapReward.put("CtimeMax",0.09181865252589998f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",449.64525626919783f);
mapReward.put("AhMax",447.1915487024741f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",442.78316983858895f);
mapReward.put("BhMax",443.66641889661423f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",446.35235992344957f);
mapReward.put("ChMax",448.2020742386447f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
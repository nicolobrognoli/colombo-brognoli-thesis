
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper291{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper291(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",1.0476951430691273E-4f);
mapReward.put("AtimeMax",0.06542288100869552f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.021695679985280148f);
mapReward.put("BtimeMax",0.018274078872613352f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.014407626352598724f);
mapReward.put("CtimeMax",0.0338248848004671f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1709.4119710605262f);
mapReward.put("AhMax",1713.0020182154499f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1712.7661611255587f);
mapReward.put("BhMax",1716.070092095428f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1713.1111682959336f);
mapReward.put("ChMax",1709.7152980684173f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
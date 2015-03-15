
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper17{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper17(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05805221805914562f);
mapReward.put("AtimeMax",0.02497572944108768f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.04243467225785054f);
mapReward.put("BtimeMax",0.05956392520059606f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.029282573323062645f);
mapReward.put("CtimeMax",0.06383003339203425f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1986.4894618248895f);
mapReward.put("AhMax",1990.060175490536f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1987.4142370295112f);
mapReward.put("BhMax",1986.1238031226712f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1984.1875432412758f);
mapReward.put("ChMax",1985.4999695838233f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
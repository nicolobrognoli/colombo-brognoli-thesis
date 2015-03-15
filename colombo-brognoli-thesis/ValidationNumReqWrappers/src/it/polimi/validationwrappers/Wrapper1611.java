
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1611{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1611(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.049765219002752645f);
mapReward.put("AtimeMax",0.007079140785300619f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.057225120809558605f);
mapReward.put("BtimeMax",0.07384277066055416f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.022926113690015893f);
mapReward.put("CtimeMax",0.0883817217878014f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",397.12121569310466f);
mapReward.put("AhMax",389.8764177941803f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",393.2859022546155f);
mapReward.put("BhMax",393.7088366765306f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",398.0572166416964f);
mapReward.put("ChMax",398.8390453160945f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
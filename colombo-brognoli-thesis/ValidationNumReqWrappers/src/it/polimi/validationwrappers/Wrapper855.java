
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper855{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper855(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08657573058853621f);
mapReward.put("AtimeMax",0.06316604485752707f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.014066639708576223f);
mapReward.put("BtimeMax",0.06768138793188311f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06379742052698048f);
mapReward.put("CtimeMax",0.0027582667473460163f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1148.7837134955587f);
mapReward.put("AhMax",1146.3388050644608f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1154.5986110931078f);
mapReward.put("BhMax",1152.8794713873654f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1146.4474655629003f);
mapReward.put("ChMax",1149.6653741646846f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
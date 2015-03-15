
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper849{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper849(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08414882000904983f);
mapReward.put("AtimeMax",0.08489840023766024f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.08887257522520324f);
mapReward.put("BtimeMax",0.08132636042016717f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09586197661473742f);
mapReward.put("CtimeMax",0.018579424470864702f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1156.827335400829f);
mapReward.put("AhMax",1159.7892501549845f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1157.150691467477f);
mapReward.put("BhMax",1151.725946540637f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1152.280903644268f);
mapReward.put("ChMax",1158.61710320541f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
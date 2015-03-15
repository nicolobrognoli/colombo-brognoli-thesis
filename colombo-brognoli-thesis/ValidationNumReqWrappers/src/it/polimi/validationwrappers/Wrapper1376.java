
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1376{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1376(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09505802398245064f);
mapReward.put("AtimeMax",0.034279861647348385f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.035541612903303745f);
mapReward.put("BtimeMax",0.044308321856773414f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03979295756703819f);
mapReward.put("CtimeMax",0.07846414798891238f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",633.6919595521626f);
mapReward.put("AhMax",629.5713275671126f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",633.6651563557987f);
mapReward.put("BhMax",633.1015534010066f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",632.6261341128788f);
mapReward.put("ChMax",633.5396684674084f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
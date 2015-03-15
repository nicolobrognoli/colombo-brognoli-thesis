
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper782{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper782(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06953567346877555f);
mapReward.put("AtimeMax",0.012369232232484983f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.055619342461656604f);
mapReward.put("BtimeMax",0.09359814871129485f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03136987033141404f);
mapReward.put("CtimeMax",0.06332640854536574f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1227.56655223825f);
mapReward.put("AhMax",1220.2424086157027f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1227.435043198589f);
mapReward.put("BhMax",1225.2055352032244f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1218.8844215471047f);
mapReward.put("ChMax",1223.423084598702f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
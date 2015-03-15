
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1811{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1811(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04768436490675402f);
mapReward.put("AtimeMax",0.05979729996993548f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.042652163435683066f);
mapReward.put("BtimeMax",0.06306205234112991f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08355339793002563f);
mapReward.put("CtimeMax",0.023780835534565205f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",193.82218148566847f);
mapReward.put("AhMax",189.05101299718302f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",195.92430515090533f);
mapReward.put("BhMax",197.19390278158357f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",193.2609631720887f);
mapReward.put("ChMax",191.96102185741304f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1116{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1116(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0478311887012476f);
mapReward.put("AtimeMax",0.06474083632978385f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.059992823929129836f);
mapReward.put("BtimeMax",0.0244844912774543f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02566541598720724f);
mapReward.put("CtimeMax",0.03711684066651114f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",887.1044338744714f);
mapReward.put("AhMax",889.9796281783682f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",884.6468916888466f);
mapReward.put("BhMax",888.1307852923558f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",888.9562441280582f);
mapReward.put("ChMax",891.3587227014195f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
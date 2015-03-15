
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1041{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1041(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0918496255871531f);
mapReward.put("AtimeMax",0.08975076365528012f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",3.269643917878873E-4f);
mapReward.put("BtimeMax",0.06308435655618588f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.010947255244034693f);
mapReward.put("CtimeMax",0.03571010625380404f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",960.3849561778408f);
mapReward.put("AhMax",964.0035881808403f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",964.0061455045446f);
mapReward.put("BhMax",962.8169886775354f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",968.6214108110278f);
mapReward.put("ChMax",964.2272140178727f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
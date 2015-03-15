
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1185{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1185(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.012475512147033874f);
mapReward.put("AtimeMax",0.0316705484862758f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.053419098348240435f);
mapReward.put("BtimeMax",0.0854930227894163f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06659564597112519f);
mapReward.put("CtimeMax",0.061313658168243954f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",824.3943468042464f);
mapReward.put("AhMax",821.5694670886531f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",820.757819771907f);
mapReward.put("BhMax",820.5804741110501f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",823.6313655285593f);
mapReward.put("ChMax",823.2205786454359f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
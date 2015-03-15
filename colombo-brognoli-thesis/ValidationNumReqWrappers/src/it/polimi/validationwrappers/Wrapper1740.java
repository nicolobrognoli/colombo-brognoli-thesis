
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1740{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1740(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08025000339498142f);
mapReward.put("AtimeMax",0.019800380311503652f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.003794965469151612f);
mapReward.put("BtimeMax",0.011517744791884632f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04340055791078375f);
mapReward.put("CtimeMax",0.015430278424559584f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",267.69798280659404f);
mapReward.put("AhMax",265.3412980262334f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",260.11135294393574f);
mapReward.put("BhMax",263.8511111417811f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",260.71376017271047f);
mapReward.put("ChMax",263.1481118079634f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
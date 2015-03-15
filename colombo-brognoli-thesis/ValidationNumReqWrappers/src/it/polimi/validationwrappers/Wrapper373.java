
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper373{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper373(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.051594123971538355f);
mapReward.put("AtimeMax",0.0693646669430304f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.029055854247847866f);
mapReward.put("BtimeMax",0.06929310058280413f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01973029295138957f);
mapReward.put("CtimeMax",0.012878510983592962f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1633.4199130278457f);
mapReward.put("AhMax",1636.0978942044414f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1632.219451676644f);
mapReward.put("BhMax",1629.8808485823877f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1632.560491501322f);
mapReward.put("ChMax",1630.617825104861f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
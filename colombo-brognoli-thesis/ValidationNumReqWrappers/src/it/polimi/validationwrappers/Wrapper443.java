
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper443{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper443(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0718612058577008f);
mapReward.put("AtimeMax",0.01943150949740431f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.04070266115314578f);
mapReward.put("BtimeMax",0.09291779873737768f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.017904981392031803f);
mapReward.put("CtimeMax",0.07553005182559909f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1557.177957925228f);
mapReward.put("AhMax",1564.9480259501422f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1565.6581556437454f);
mapReward.put("BhMax",1563.3861037178174f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1559.9043538568183f);
mapReward.put("ChMax",1564.4506895766021f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper490{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper490(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07397109297231369f);
mapReward.put("AtimeMax",0.031233922968925232f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.001287277313411417f);
mapReward.put("BtimeMax",0.08259778392475606f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08914966071211375f);
mapReward.put("CtimeMax",0.041478574692063154f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1511.7675002993005f);
mapReward.put("AhMax",1512.0171535141337f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1516.8971493596741f);
mapReward.put("BhMax",1517.2845827267013f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1510.6871264474014f);
mapReward.put("ChMax",1515.3565691173976f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
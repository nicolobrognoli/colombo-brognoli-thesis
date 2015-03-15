
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper985{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper985(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.003909704065911168f);
mapReward.put("AtimeMax",0.037684915151091514f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.00798158111300723f);
mapReward.put("BtimeMax",0.024033161349103625f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05394964182881201f);
mapReward.put("CtimeMax",0.015125881753877735f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1022.9183960272759f);
mapReward.put("AhMax",1023.0475463686795f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1023.5010653975554f);
mapReward.put("BhMax",1020.7371449768968f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1021.120993499319f);
mapReward.put("ChMax",1020.2866001899714f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
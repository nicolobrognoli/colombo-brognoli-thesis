
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1642{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1642(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.042534727628168366f);
mapReward.put("AtimeMax",0.00951773330620299f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.00579680373107323f);
mapReward.put("BtimeMax",0.0869727122517053f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03773403072152198f);
mapReward.put("CtimeMax",0.0670444134499252f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",363.303814577949f);
mapReward.put("AhMax",363.7469591394326f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",364.3573854162425f);
mapReward.put("BhMax",359.6654154707988f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",363.2237848677165f);
mapReward.put("ChMax",363.8845136345889f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
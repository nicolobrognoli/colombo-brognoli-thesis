
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper949{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper949(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02856841268626211f);
mapReward.put("AtimeMax",0.09636188855444211f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",5.05138687508E-4f);
mapReward.put("BtimeMax",0.05780494009946796f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08658273017575699f);
mapReward.put("CtimeMax",0.030285968761161453f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1051.0817436493057f);
mapReward.put("AhMax",1059.433784511284f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1051.5426629647786f);
mapReward.put("BhMax",1052.9839685153597f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1052.8650577035694f);
mapReward.put("ChMax",1051.074020226661f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
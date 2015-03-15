
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper203{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper203(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07486129578154008f);
mapReward.put("AtimeMax",0.04558030453053965f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.08362067031749493f);
mapReward.put("BtimeMax",0.029697461148972627f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",4.680907092078357E-5f);
mapReward.put("CtimeMax",0.058552560360866944f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1802.6048417933675f);
mapReward.put("AhMax",1806.088010884372f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1802.376596118299f);
mapReward.put("BhMax",1803.6307913513906f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1797.7870905484713f);
mapReward.put("ChMax",1802.9932943711917f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
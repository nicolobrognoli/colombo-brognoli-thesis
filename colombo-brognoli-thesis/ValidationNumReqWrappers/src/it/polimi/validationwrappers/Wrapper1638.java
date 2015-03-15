
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1638{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1638(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06992857347839208f);
mapReward.put("AtimeMax",0.013538207714283657f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.021485606104030507f);
mapReward.put("BtimeMax",0.034386029102833296f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",7.771889506742013E-4f);
mapReward.put("CtimeMax",0.005688616505553889f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",370.7372488274546f);
mapReward.put("AhMax",371.514937332043f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",364.44636222819383f);
mapReward.put("BhMax",364.12901234525305f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",369.2505228239629f);
mapReward.put("ChMax",366.87697704150736f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
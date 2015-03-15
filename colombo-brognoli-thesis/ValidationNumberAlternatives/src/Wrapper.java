import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper implements ActivityInterface{
	private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper(){
rewardNameList.add("time");rewardNameList.add("usability");		mapReward.put("totaltime", 22.0f);mapReward.put("weighttime", 0.7f);		mapReward.put("totalusability", 17.0f);mapReward.put("weightusability", 0.3f);		mapReward.put("policyusability", 1.0f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",6.0f);
mapReward.put("AtimeMin",6.0f);
mapReward.put("AtimeMax",6.0f);
mapReward.put("Ausability",6.0f);
mapReward.put("AusabilityMin",6.0f);
mapReward.put("AusabilityMax",6.0f);
alternatives.add("B");
mapReward.put("Btime",6.0f);
mapReward.put("BtimeMin",6.0f);
mapReward.put("BtimeMax",6.0f);
mapReward.put("Busability",6.0f);
mapReward.put("BusabilityMin",6.0f);
mapReward.put("BusabilityMax",6.0f);
alternatives.add("C");
mapReward.put("Ctime",6.0f);
mapReward.put("CtimeMin",6.0f);
mapReward.put("CtimeMax",6.0f);
mapReward.put("Cusability",6.0f);
mapReward.put("CusabilityMin",6.0f);
mapReward.put("CusabilityMax",6.0f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
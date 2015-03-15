
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1593{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1593(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09004361169917388f);
mapReward.put("AtimeMax",0.01767135293298191f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.044170080461364905f);
mapReward.put("BtimeMax",0.026590701745325386f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0219162302992152f);
mapReward.put("CtimeMax",0.0581325967476425f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",416.8366639450192f);
mapReward.put("AhMax",411.95525805749384f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",413.26773754732824f);
mapReward.put("BhMax",407.10528867956174f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",412.68098308572047f);
mapReward.put("ChMax",408.6128614835769f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
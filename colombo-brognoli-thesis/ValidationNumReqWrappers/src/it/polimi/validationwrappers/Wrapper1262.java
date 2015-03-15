
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1262{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1262(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02787811153767179f);
mapReward.put("AtimeMax",0.04614147530711764f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.043380176362950086f);
mapReward.put("BtimeMax",0.0029090717737293216f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06291828165550978f);
mapReward.put("CtimeMax",0.04472621755060267f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",741.4275545263166f);
mapReward.put("AhMax",743.9364822298306f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",740.0916983122883f);
mapReward.put("BhMax",743.0614349248389f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",739.2374658780238f);
mapReward.put("ChMax",739.062633388522f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
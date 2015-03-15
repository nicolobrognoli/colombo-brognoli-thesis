
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper67{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper67(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.028512035776138422f);
mapReward.put("AtimeMax",0.0976697634844308f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.003163679940259867f);
mapReward.put("BtimeMax",0.035111790179562584f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",6.786623721397045E-4f);
mapReward.put("CtimeMax",0.046507191517957215f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1933.3328959177104f);
mapReward.put("AhMax",1935.2597793830917f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1939.8819368308164f);
mapReward.put("BhMax",1939.7689708758528f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1941.2428202114488f);
mapReward.put("ChMax",1936.1735946105362f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
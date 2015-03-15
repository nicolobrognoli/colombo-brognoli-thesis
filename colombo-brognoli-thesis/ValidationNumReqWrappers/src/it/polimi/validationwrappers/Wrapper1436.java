
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1436{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1436(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.012204416359475246f);
mapReward.put("AtimeMax",0.01720809097703374f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.058997595243886446f);
mapReward.put("BtimeMax",0.06657681231288885f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01778794000754085f);
mapReward.put("CtimeMax",0.009290280808281193f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",566.5896719670205f);
mapReward.put("AhMax",566.3330180982239f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",573.0552082271342f);
mapReward.put("BhMax",570.1506721140199f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",568.4258494219623f);
mapReward.put("ChMax",573.4396304514402f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
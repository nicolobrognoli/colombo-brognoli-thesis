
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1733{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1733(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04817023474304882f);
mapReward.put("AtimeMax",0.03448137163922281f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.023044596921382533f);
mapReward.put("BtimeMax",0.04785834462038922f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06473358155225083f);
mapReward.put("CtimeMax",0.033213958825057566f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",273.8425338906536f);
mapReward.put("AhMax",276.39538452705665f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",269.76395092607623f);
mapReward.put("BhMax",268.65325106325247f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",268.5665950329362f);
mapReward.put("ChMax",276.4305316409302f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
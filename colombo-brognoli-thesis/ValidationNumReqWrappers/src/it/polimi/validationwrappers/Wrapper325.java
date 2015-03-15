
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper325{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper325(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.059792166827229695f);
mapReward.put("AtimeMax",0.08640425605695891f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.005577102863428796f);
mapReward.put("BtimeMax",0.045567240047836466f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.029159731761980633f);
mapReward.put("CtimeMax",0.06162720881065329f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1675.1227305612817f);
mapReward.put("AhMax",1678.3726853911885f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1682.0195748549422f);
mapReward.put("BhMax",1683.7536305081105f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1683.4614790167018f);
mapReward.put("ChMax",1682.4602159895971f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
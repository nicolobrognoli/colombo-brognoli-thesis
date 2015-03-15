
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1978{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1978(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.027694534340626187f);
mapReward.put("AtimeMax",0.0065588643878426115f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.018087580917122335f);
mapReward.put("BtimeMax",0.041800942604767244f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.010214629246451279f);
mapReward.put("CtimeMax",0.0677535690201912f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",24.502518095320557f);
mapReward.put("AhMax",28.79288133144683f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",31.25427527749776f);
mapReward.put("BhMax",29.403446773362816f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",27.33849716598582f);
mapReward.put("ChMax",30.79378839817818f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper703{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper703(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0826087007160758f);
mapReward.put("AtimeMax",0.07700742294524182f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.03520767547741569f);
mapReward.put("BtimeMax",0.06543561299962705f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09970900942677267f);
mapReward.put("CtimeMax",0.009229028091343128f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1301.5977468060473f);
mapReward.put("AhMax",1297.178827974039f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1306.3863568532595f);
mapReward.put("BhMax",1301.4566678118401f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1302.080946878069f);
mapReward.put("ChMax",1298.8923383232573f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
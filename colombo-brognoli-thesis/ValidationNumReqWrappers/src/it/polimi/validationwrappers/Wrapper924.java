
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper924{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper924(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06357512272742963f);
mapReward.put("AtimeMax",0.01176166165419339f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.01935678412634333f);
mapReward.put("BtimeMax",0.05093610565732791f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.012692121249016818f);
mapReward.put("CtimeMax",0.07202204739878622f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1079.4959126909664f);
mapReward.put("AhMax",1076.1665107172569f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1083.0264950767555f);
mapReward.put("BhMax",1082.2728144181579f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1078.8935778110492f);
mapReward.put("ChMax",1076.8154533423779f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
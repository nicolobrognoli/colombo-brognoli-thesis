
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1807{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1807(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.050598099830664114f);
mapReward.put("AtimeMax",0.038643387289202205f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.038490972140119505f);
mapReward.put("BtimeMax",0.08087895774577739f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.010971742410418617f);
mapReward.put("CtimeMax",0.03459255989016741f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",200.86319611339152f);
mapReward.put("AhMax",196.51414570935665f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",193.89883398009735f);
mapReward.put("BhMax",193.0708406047544f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",198.7932429633814f);
mapReward.put("ChMax",202.7865496608694f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
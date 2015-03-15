
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper346{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper346(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.01548105727072504f);
mapReward.put("AtimeMax",0.019623088886014127f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.016688597128803172f);
mapReward.put("BtimeMax",0.023209650534812686f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02156186071795223f);
mapReward.put("CtimeMax",0.08766967560939608f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1662.0796984575459f);
mapReward.put("AhMax",1660.269154056722f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1662.1931431189453f);
mapReward.put("BhMax",1654.8563110775915f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1663.163929694298f);
mapReward.put("ChMax",1662.405345904996f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
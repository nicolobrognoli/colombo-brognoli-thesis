
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1991{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1991(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.059373923482479066f);
mapReward.put("AtimeMax",0.041859571618658976f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.015181762214287086f);
mapReward.put("BtimeMax",0.08296666276005135f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08498192885880652f);
mapReward.put("CtimeMax",0.06435874355439442f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",10.961587292281468f);
mapReward.put("AhMax",13.654697824626771f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",12.561206199187023f);
mapReward.put("BhMax",11.01169589536476f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",11.815054087964814f);
mapReward.put("ChMax",14.839229915895661f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
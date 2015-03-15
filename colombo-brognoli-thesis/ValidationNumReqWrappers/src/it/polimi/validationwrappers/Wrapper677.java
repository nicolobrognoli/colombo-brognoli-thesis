
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper677{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper677(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08096769798507705f);
mapReward.put("AtimeMax",0.07423105171359938f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.026724546690485816f);
mapReward.put("BtimeMax",0.0896999294845405f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05090347305300279f);
mapReward.put("CtimeMax",0.0722963572151776f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1324.825736448061f);
mapReward.put("AhMax",1323.841288658029f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1327.415834387174f);
mapReward.put("BhMax",1323.184851584544f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1330.4192960044122f);
mapReward.put("ChMax",1331.4605734544155f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
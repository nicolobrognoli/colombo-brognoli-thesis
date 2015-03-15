
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper669{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper669(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.023534169451325714f);
mapReward.put("AtimeMax",0.06208344597198111f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.034279576730946296f);
mapReward.put("BtimeMax",0.0847529400638383f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06281203340875921f);
mapReward.put("CtimeMax",0.06822044637916516f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1332.7456899512429f);
mapReward.put("AhMax",1338.4011905069779f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1337.574953656922f);
mapReward.put("BhMax",1340.7324218607725f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1335.7254149739128f);
mapReward.put("ChMax",1337.8857124538401f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
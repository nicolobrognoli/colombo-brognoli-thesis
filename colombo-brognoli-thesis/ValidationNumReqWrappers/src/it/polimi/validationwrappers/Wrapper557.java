
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper557{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper557(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07386433829887792f);
mapReward.put("AtimeMax",0.09968537717738979f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.059008920122404426f);
mapReward.put("BtimeMax",0.013436699025725519f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08961918878147725f);
mapReward.put("CtimeMax",0.04025528597546087f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1444.9512411848925f);
mapReward.put("AhMax",1452.04873787031f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1450.5837661302476f);
mapReward.put("BhMax",1447.9006882039887f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1452.713931886738f);
mapReward.put("ChMax",1448.4079857280992f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper60{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper60(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09528541308787117f);
mapReward.put("AtimeMax",0.017564283325434794f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.021299433598382312f);
mapReward.put("BtimeMax",0.07181025013259842f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04505279031632714f);
mapReward.put("CtimeMax",0.07604766341515537f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1945.135843229715f);
mapReward.put("AhMax",1947.124486926837f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1946.0790735928354f);
mapReward.put("BhMax",1943.8057015771537f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1942.9036774602585f);
mapReward.put("ChMax",1945.1362611138698f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1809{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1809(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07879280155233076f);
mapReward.put("AtimeMax",0.0330795722055459f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.039675344515293184f);
mapReward.put("BtimeMax",0.03568798573264487f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04314881571045263f);
mapReward.put("CtimeMax",0.07324909401345833f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",197.29185943631137f);
mapReward.put("AhMax",197.11395875787127f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",193.06668486059334f);
mapReward.put("BhMax",195.47273739855274f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",195.88750955906724f);
mapReward.put("ChMax",199.60836769200853f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
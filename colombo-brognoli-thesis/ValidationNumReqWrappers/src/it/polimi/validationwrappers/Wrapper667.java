
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper667{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper667(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08535091396113868f);
mapReward.put("AtimeMax",0.09706504474278883f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.082093373005765f);
mapReward.put("BtimeMax",0.08258444898241432f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0846514547164802f);
mapReward.put("CtimeMax",0.013640601950215481f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1337.928018784261f);
mapReward.put("AhMax",1337.6396090834805f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1337.1532041547766f);
mapReward.put("BhMax",1338.9161988906403f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1339.5808529891908f);
mapReward.put("ChMax",1336.4562318915366f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
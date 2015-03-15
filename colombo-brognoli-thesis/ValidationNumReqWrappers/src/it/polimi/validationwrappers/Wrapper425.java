
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper425{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper425(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02526192808339206f);
mapReward.put("AtimeMax",0.03474712059116515f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.051892087699504874f);
mapReward.put("BtimeMax",0.0505452031872588f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07222061105783295f);
mapReward.put("CtimeMax",0.02050997698770616f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1578.8205817587507f);
mapReward.put("AhMax",1575.6269470760515f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1580.6925815058644f);
mapReward.put("BhMax",1576.9876565593074f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1581.12888987129f);
mapReward.put("ChMax",1583.1678966668678f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
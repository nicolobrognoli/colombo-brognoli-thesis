
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1448{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1448(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02868839287119087f);
mapReward.put("AtimeMax",0.07307251855412436f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.057893771280410636f);
mapReward.put("BtimeMax",0.08867250391490247f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04098888668204574f);
mapReward.put("CtimeMax",0.042165305888311286f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",557.4964215054262f);
mapReward.put("AhMax",559.6360373606195f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",561.3646635505277f);
mapReward.put("BhMax",556.3256947424618f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",552.3605624681735f);
mapReward.put("ChMax",557.2444203097336f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1145{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1145(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.076885847409972f);
mapReward.put("AtimeMax",0.007973503666852922f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.056597313185357476f);
mapReward.put("BtimeMax",0.08177058898372472f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.040019130706337336f);
mapReward.put("CtimeMax",0.0621190191694004f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",863.2324098105104f);
mapReward.put("AhMax",862.2938603812579f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",859.7019901210699f);
mapReward.put("BhMax",858.8053250178275f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",861.6877429758678f);
mapReward.put("ChMax",861.9828706925085f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
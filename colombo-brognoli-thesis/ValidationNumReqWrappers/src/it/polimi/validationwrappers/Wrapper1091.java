
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1091{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1091(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.038621930372812883f);
mapReward.put("AtimeMax",0.05201956214438711f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.041480157558933216f);
mapReward.put("BtimeMax",0.05463287728147385f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.006512072215673337f);
mapReward.put("CtimeMax",0.08234553445535349f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",912.2244112564031f);
mapReward.put("AhMax",915.903742070598f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",915.4318849790279f);
mapReward.put("BhMax",918.8177762114414f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",917.2703426808215f);
mapReward.put("ChMax",918.045886931721f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
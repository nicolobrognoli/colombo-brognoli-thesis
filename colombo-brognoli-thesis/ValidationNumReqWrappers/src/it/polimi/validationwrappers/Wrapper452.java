
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper452{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper452(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06140515900721886f);
mapReward.put("AtimeMax",0.0400981191410049f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.023427772028976713f);
mapReward.put("BtimeMax",0.04833305696049832f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0653896381557393f);
mapReward.put("CtimeMax",0.07803443128582452f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1554.5877652798074f);
mapReward.put("AhMax",1556.8874646891484f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1554.073338673488f);
mapReward.put("BhMax",1556.7845540496053f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1549.4993921481703f);
mapReward.put("ChMax",1556.498386813642f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
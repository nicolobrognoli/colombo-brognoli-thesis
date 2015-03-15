
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper396{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper396(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04928747493773032f);
mapReward.put("AtimeMax",0.05005486923469325f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.00432778275557052f);
mapReward.put("BtimeMax",0.06067307681924371f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06132986011466877f);
mapReward.put("CtimeMax",0.04625627007844864f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1608.806577897117f);
mapReward.put("AhMax",1604.7665480718367f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1609.107790576571f);
mapReward.put("BhMax",1612.5332031730404f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1605.2750464568328f);
mapReward.put("ChMax",1607.8364880548243f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
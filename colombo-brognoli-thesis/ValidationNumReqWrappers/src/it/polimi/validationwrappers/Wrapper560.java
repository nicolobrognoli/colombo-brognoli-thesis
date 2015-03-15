
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper560{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper560(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07977831237233693f);
mapReward.put("AtimeMax",0.09674813644982067f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.045935659241692114f);
mapReward.put("BtimeMax",0.09270769418210073f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05181977076364205f);
mapReward.put("CtimeMax",0.04367719833543012f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1443.7974269627691f);
mapReward.put("AhMax",1441.6478516807758f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1445.4014313816322f);
mapReward.put("BhMax",1442.189774748466f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1442.9302702294383f);
mapReward.put("ChMax",1447.4849380715398f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
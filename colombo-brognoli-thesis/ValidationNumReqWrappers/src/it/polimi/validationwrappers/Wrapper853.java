
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper853{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper853(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0038241745070664245f);
mapReward.put("AtimeMax",0.05178171903073706f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.033183301439940235f);
mapReward.put("BtimeMax",0.02704055823463981f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05507496698625556f);
mapReward.put("CtimeMax",0.05318079662689272f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1151.550582834083f);
mapReward.put("AhMax",1152.905962015612f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1153.1158974917212f);
mapReward.put("BhMax",1148.2114889901245f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1155.697621700885f);
mapReward.put("ChMax",1148.4805608727304f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
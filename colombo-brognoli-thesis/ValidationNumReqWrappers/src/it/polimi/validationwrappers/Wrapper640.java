
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper640{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper640(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.020213350673097086f);
mapReward.put("AtimeMax",0.06408953338386732f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.028818189834496834f);
mapReward.put("BtimeMax",0.01476097772394933f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01828370984813359f);
mapReward.put("CtimeMax",0.014134222838046172f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1362.8491322266607f);
mapReward.put("AhMax",1363.1817557296897f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1363.0576821459745f);
mapReward.put("BhMax",1367.9910335986724f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1368.0682146494298f);
mapReward.put("ChMax",1366.9818164871767f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
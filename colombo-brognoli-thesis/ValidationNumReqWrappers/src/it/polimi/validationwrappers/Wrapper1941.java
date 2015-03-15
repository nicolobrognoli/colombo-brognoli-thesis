
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1941{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1941(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03944425720440481f);
mapReward.put("AtimeMax",0.03903292417039476f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.044586537324238194f);
mapReward.put("BtimeMax",0.024988390361340908f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0655735075897225f);
mapReward.put("CtimeMax",0.07708412822859799f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",63.978341817352614f);
mapReward.put("AhMax",60.853604113593725f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",66.14364507061224f);
mapReward.put("BhMax",65.72037230328098f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",65.59604252424654f);
mapReward.put("ChMax",59.98162341735618f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
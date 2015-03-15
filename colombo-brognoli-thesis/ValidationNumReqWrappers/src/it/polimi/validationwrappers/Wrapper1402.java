
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1402{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1402(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03920959898292451f);
mapReward.put("AtimeMax",0.004188681837397734f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.011494015859171125f);
mapReward.put("BtimeMax",0.07416627468243961f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0025249466931271504f);
mapReward.put("CtimeMax",0.007480671489825707f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",599.4322944991493f);
mapReward.put("AhMax",599.542099577876f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",599.3718217545343f);
mapReward.put("BhMax",604.7973171316985f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",601.8467632635694f);
mapReward.put("ChMax",604.6524738791069f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
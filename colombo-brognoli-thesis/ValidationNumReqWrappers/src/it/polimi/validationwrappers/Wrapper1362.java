
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1362{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1362(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.012346841196307079f);
mapReward.put("AtimeMax",0.05009132050746947f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.021615592497596404f);
mapReward.put("BtimeMax",0.05039831699905165f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.00850977294671772f);
mapReward.put("CtimeMax",0.08341801471105308f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",646.8812664700039f);
mapReward.put("AhMax",642.1831105856365f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",640.7527212874752f);
mapReward.put("BhMax",641.9043636947249f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",643.1082443610152f);
mapReward.put("ChMax",644.0209709237342f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
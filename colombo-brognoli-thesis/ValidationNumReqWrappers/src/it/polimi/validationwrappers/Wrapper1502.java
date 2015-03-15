
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1502{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1502(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08574359895319879f);
mapReward.put("AtimeMax",0.002227441425092025f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.059170959271559985f);
mapReward.put("BtimeMax",0.01492300227750536f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0062228276439149745f);
mapReward.put("CtimeMax",0.023529600846176457f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",501.5704868007319f);
mapReward.put("AhMax",499.8639489965004f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",506.9399517459734f);
mapReward.put("BhMax",502.14537773779927f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",499.47427118250505f);
mapReward.put("ChMax",504.3172945424268f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
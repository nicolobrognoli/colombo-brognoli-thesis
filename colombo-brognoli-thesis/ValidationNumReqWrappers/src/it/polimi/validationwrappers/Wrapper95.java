
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper95{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper95(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.006957544732055831f);
mapReward.put("AtimeMax",0.07716977180833784f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.03143703697727609f);
mapReward.put("BtimeMax",0.03231481933698695f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",3.599336152790733E-4f);
mapReward.put("CtimeMax",0.005587997657744037f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1908.0454229791094f);
mapReward.put("AhMax",1912.2290077457612f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1905.314022203336f);
mapReward.put("BhMax",1912.1251556683314f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1914.6244136195085f);
mapReward.put("ChMax",1912.3768263010936f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
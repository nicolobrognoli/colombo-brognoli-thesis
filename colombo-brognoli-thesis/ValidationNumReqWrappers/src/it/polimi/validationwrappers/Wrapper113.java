
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper113{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper113(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.011530395873966481f);
mapReward.put("AtimeMax",0.04333169839844257f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.031612615649635314f);
mapReward.put("BtimeMax",0.05616043639958561f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06862257346195352f);
mapReward.put("CtimeMax",0.09839400129020667f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1890.2712534109978f);
mapReward.put("AhMax",1893.8724247059201f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1894.6563134973248f);
mapReward.put("BhMax",1888.326622136473f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1892.7382044160104f);
mapReward.put("ChMax",1888.6632088946906f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
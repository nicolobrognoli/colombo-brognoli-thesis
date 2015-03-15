
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper477{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper477(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.058367485556078236f);
mapReward.put("AtimeMax",0.03278445264692346f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.020061689420446827f);
mapReward.put("BtimeMax",0.05179706947845318f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05055307277037335f);
mapReward.put("CtimeMax",0.05065671752714396f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1524.3131337423501f);
mapReward.put("AhMax",1530.8681127163823f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1529.0758927902184f);
mapReward.put("BhMax",1525.7034256367579f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1526.0510447079023f);
mapReward.put("ChMax",1527.9451404518481f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
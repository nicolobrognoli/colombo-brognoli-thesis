
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1394{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1394(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06764063975128572f);
mapReward.put("AtimeMax",0.08564953941020267f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.052437494441905465f);
mapReward.put("BtimeMax",0.06476900343939247f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01835965320025046f);
mapReward.put("CtimeMax",0.03935954808740947f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",615.1323198792392f);
mapReward.put("AhMax",612.3052179594782f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",611.719683359056f);
mapReward.put("BhMax",608.6027643915244f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",610.7757364652141f);
mapReward.put("ChMax",610.7298406545723f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
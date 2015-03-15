
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper341{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper341(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03960857720006603f);
mapReward.put("AtimeMax",0.09994949299228835f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.09229156086665734f);
mapReward.put("BtimeMax",0.0016016739823979554f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",4.5452248683253146E-5f);
mapReward.put("CtimeMax",0.02435043832140684f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1666.402627046979f);
mapReward.put("AhMax",1664.7612468314308f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1663.9466759187947f);
mapReward.put("BhMax",1668.1151644828883f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1668.7658391142686f);
mapReward.put("ChMax",1662.677129256399f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1006{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1006(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.048840692503111835f);
mapReward.put("AtimeMax",0.08272057816044366f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.040512066110471236f);
mapReward.put("BtimeMax",0.08125814581129209f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.023476923778475045f);
mapReward.put("CtimeMax",0.07116075095948715f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",997.8655251798573f);
mapReward.put("AhMax",1003.371909513781f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1001.0829495468834f);
mapReward.put("BhMax",994.7411249024361f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",998.8431700801104f);
mapReward.put("ChMax",995.6598660205184f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
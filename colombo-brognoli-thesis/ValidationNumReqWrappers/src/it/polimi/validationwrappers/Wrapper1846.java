
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1846{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1846(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.061584906444404376f);
mapReward.put("AtimeMax",0.029597099912388024f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.017851913423568577f);
mapReward.put("BtimeMax",5.092679042893011E-4f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03869137443374202f);
mapReward.put("CtimeMax",0.0668816096733186f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",161.84395283561776f);
mapReward.put("AhMax",161.13842518293535f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",158.04321966180441f);
mapReward.put("BhMax",160.7440878824417f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",159.3659488870641f);
mapReward.put("ChMax",158.9962992196077f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1088{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1088(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.053116731400239856f);
mapReward.put("AtimeMax",0.07323356694242375f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.059157946086479826f);
mapReward.put("BtimeMax",0.03969393892719998f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.034262647238523056f);
mapReward.put("CtimeMax",0.08242010765687811f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",920.259165089368f);
mapReward.put("AhMax",919.407225930812f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",916.4528095397741f);
mapReward.put("BhMax",916.4361357287117f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",914.2088481546366f);
mapReward.put("ChMax",912.8842517105808f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
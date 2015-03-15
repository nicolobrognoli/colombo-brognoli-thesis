
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1309{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1309(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",7.007500716903481E-5f);
mapReward.put("AtimeMax",0.032907681318474415f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.001623169730332441f);
mapReward.put("BtimeMax",0.06954692203578852f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07189317993913354f);
mapReward.put("CtimeMax",0.038246798024897125f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",692.5395178850594f);
mapReward.put("AhMax",699.6740695744189f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",691.8138307797611f);
mapReward.put("BhMax",699.3464313109716f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",699.668324073953f);
mapReward.put("ChMax",700.534233009442f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
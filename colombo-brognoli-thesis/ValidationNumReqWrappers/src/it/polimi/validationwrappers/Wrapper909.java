
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper909{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper909(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07640136767909697f);
mapReward.put("AtimeMax",0.06575167863640537f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.048051781357995024f);
mapReward.put("BtimeMax",0.08386616548144808f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04329623080801359f);
mapReward.put("CtimeMax",0.035835413859099274f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1093.923291089988f);
mapReward.put("AhMax",1093.8023890268812f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1097.766719956622f);
mapReward.put("BhMax",1095.4200724835587f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1094.6512654457606f);
mapReward.put("ChMax",1092.8835606732655f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
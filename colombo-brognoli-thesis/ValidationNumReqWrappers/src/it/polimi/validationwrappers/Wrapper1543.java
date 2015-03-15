
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1543{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1543(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.005564246024208375f);
mapReward.put("AtimeMax",0.0013814573603608605f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",2.838514212071819E-4f);
mapReward.put("BtimeMax",0.04703614497343992f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09788366891395231f);
mapReward.put("CtimeMax",0.04272842406111321f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",464.21857784024667f);
mapReward.put("AhMax",461.39020374676136f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",461.911278689081f);
mapReward.put("BhMax",462.3091603786859f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",457.7069043515131f);
mapReward.put("ChMax",460.79554445688404f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
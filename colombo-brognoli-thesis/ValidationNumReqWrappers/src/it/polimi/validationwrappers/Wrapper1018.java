
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1018{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1018(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05772576213345961f);
mapReward.put("AtimeMax",0.036892089518907004f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.0552594058197751f);
mapReward.put("BtimeMax",0.07971067702189968f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.007538646527315484f);
mapReward.put("CtimeMax",0.04627694256895763f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",989.4988803321338f);
mapReward.put("AhMax",983.2206469016513f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",991.5058917272805f);
mapReward.put("BhMax",983.2293779549063f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",983.106480949684f);
mapReward.put("ChMax",989.8164305982827f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
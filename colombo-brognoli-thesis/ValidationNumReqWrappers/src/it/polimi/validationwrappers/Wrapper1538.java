
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1538{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1538(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07765386456268888f);
mapReward.put("AtimeMax",0.08119235600173276f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.014820012413653194f);
mapReward.put("BtimeMax",0.08060199455756892f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.039049689130444376f);
mapReward.put("CtimeMax",0.06729291310861443f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",470.22334781900315f);
mapReward.put("AhMax",469.356453715512f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",464.8826680873254f);
mapReward.put("BhMax",470.5785411905357f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",467.4610671771841f);
mapReward.put("ChMax",468.42731442479027f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
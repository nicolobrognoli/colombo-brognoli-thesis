
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper98{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper98(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.004404728415786097f);
mapReward.put("AtimeMax",0.020400100668987998f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.038626595882197315f);
mapReward.put("BtimeMax",0.04248112567758324f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.031328602181685136f);
mapReward.put("CtimeMax",2.9434717387482044E-4f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1909.4982329830639f);
mapReward.put("AhMax",1902.8103306072835f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1903.574451120948f);
mapReward.put("BhMax",1907.7687220022492f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1903.3695986750852f);
mapReward.put("ChMax",1909.603536685149f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
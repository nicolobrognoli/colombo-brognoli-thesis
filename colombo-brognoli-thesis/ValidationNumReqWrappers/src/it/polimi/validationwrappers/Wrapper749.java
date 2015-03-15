
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper749{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper749(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0895232184255631f);
mapReward.put("AtimeMax",0.03697495399011621f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.028477931283786395f);
mapReward.put("BtimeMax",0.027553182200997527f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07088056562003202f);
mapReward.put("CtimeMax",0.02679444417013298f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1259.495621533128f);
mapReward.put("AhMax",1254.4105227736004f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1253.3101551480213f);
mapReward.put("BhMax",1259.6380895248808f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1252.5730047611664f);
mapReward.put("ChMax",1260.5223022179941f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
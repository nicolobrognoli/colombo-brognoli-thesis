
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1876{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1876(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.011231326162076661f);
mapReward.put("AtimeMax",0.07928387115105721f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.030391348211171388f);
mapReward.put("BtimeMax",0.03576560530222701f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09446432605407977f);
mapReward.put("CtimeMax",0.013579470209104726f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",128.09958500565884f);
mapReward.put("AhMax",125.02064222722528f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",125.91446500026397f);
mapReward.put("BhMax",128.2012640975025f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",132.63187876426764f);
mapReward.put("ChMax",125.30793839226462f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
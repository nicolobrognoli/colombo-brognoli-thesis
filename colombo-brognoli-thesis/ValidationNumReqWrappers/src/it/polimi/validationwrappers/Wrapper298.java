
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper298{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper298(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.025459790935070503f);
mapReward.put("AtimeMax",0.025571354526548275f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.011970711034200731f);
mapReward.put("BtimeMax",0.05711045887604484f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09623039139601361f);
mapReward.put("CtimeMax",0.0024179431211021397f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1710.0981818441746f);
mapReward.put("AhMax",1705.0494896751616f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1705.971902917115f);
mapReward.put("BhMax",1704.1604126902464f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1709.1161556836714f);
mapReward.put("ChMax",1703.2550047473364f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
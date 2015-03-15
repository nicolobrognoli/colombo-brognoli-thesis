
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1853{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1853(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.016932594582676506f);
mapReward.put("AtimeMax",0.04928698817938004f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",4.858193000595201E-4f);
mapReward.put("BtimeMax",0.09447813000271148f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06802268995265184f);
mapReward.put("CtimeMax",0.06424875003749689f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",156.89003181521832f);
mapReward.put("AhMax",152.49076769624386f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",151.84598081204456f);
mapReward.put("BhMax",153.15936885751088f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",152.52556853655847f);
mapReward.put("ChMax",155.43835495029134f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
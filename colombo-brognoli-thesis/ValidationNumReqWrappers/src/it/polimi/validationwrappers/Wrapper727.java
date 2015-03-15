
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper727{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper727(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07251212846532133f);
mapReward.put("AtimeMax",0.022952125767165342f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.045337523244180035f);
mapReward.put("BtimeMax",0.046103798622534f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.014197011793562775f);
mapReward.put("CtimeMax",0.025288726972722518f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1282.5551455500658f);
mapReward.put("AhMax",1276.1518338587757f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1276.9529420043116f);
mapReward.put("BhMax",1282.0640339817628f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1280.149827427567f);
mapReward.put("ChMax",1280.2478984268664f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
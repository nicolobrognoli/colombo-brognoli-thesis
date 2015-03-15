
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1030{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1030(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.022846111426175965f);
mapReward.put("AtimeMax",0.01822031551213895f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.018394489092044164f);
mapReward.put("BtimeMax",0.08280316665831197f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0798575480384098f);
mapReward.put("CtimeMax",0.09032619516145292f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",970.2559147104113f);
mapReward.put("AhMax",971.1148950135121f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",973.0986050290685f);
mapReward.put("BhMax",979.2929214661748f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",975.8082459298755f);
mapReward.put("ChMax",972.6421915975664f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
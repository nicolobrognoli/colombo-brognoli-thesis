
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1844{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1844(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0822519629343244f);
mapReward.put("AtimeMax",0.07849240645636056f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.073144569560076f);
mapReward.put("BtimeMax",0.07406363273950947f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.024137340301929135f);
mapReward.put("CtimeMax",0.06990140024641005f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",158.08713379970072f);
mapReward.put("AhMax",159.0897650772048f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",158.44951181444551f);
mapReward.put("BhMax",156.6770528742457f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",158.46238717253965f);
mapReward.put("ChMax",156.15722043326463f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper308{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper308(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03830978122563905f);
mapReward.put("AtimeMax",0.013852182905472054f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.004888716234219626f);
mapReward.put("BtimeMax",0.08248141146408747f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02484567600635631f);
mapReward.put("CtimeMax",0.07828644977312188f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1697.1398079341664f);
mapReward.put("AhMax",1693.964462841822f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1696.6752342698685f);
mapReward.put("BhMax",1695.7963722987442f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1698.590865547231f);
mapReward.put("ChMax",1697.0825970375215f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1680{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1680(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07127396961540934f);
mapReward.put("AtimeMax",0.025830621791891783f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.006041750156188186f);
mapReward.put("BtimeMax",0.013205262559487296f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.028494438863593242f);
mapReward.put("CtimeMax",0.08177122385108464f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",324.06645752880974f);
mapReward.put("AhMax",321.2410176542121f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",320.13788266596913f);
mapReward.put("BhMax",324.81543975728846f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",325.34260180788056f);
mapReward.put("ChMax",320.53901725983246f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
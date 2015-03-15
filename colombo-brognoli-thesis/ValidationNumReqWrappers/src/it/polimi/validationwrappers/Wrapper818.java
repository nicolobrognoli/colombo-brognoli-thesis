
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper818{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper818(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.061574953529404064f);
mapReward.put("AtimeMax",0.007436625058405866f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.044793931172774824f);
mapReward.put("BtimeMax",0.03043565800731035f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02070239925907985f);
mapReward.put("CtimeMax",0.07673403942012934f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1191.011702083568f);
mapReward.put("AhMax",1190.3454450010654f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1187.5141481816866f);
mapReward.put("BhMax",1187.5452128180154f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1186.101771262547f);
mapReward.put("ChMax",1183.9714818737866f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
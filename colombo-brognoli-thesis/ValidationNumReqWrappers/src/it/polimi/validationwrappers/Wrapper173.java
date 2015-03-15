
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper173{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper173(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02910394246764837f);
mapReward.put("AtimeMax",0.013758808939357626f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.0737334240797409f);
mapReward.put("BtimeMax",0.021629315053267574f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0082976158394114f);
mapReward.put("CtimeMax",0.006608072879124416f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1836.2043415023438f);
mapReward.put("AhMax",1833.4646109390935f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1829.9497943509573f);
mapReward.put("BhMax",1832.8732318474129f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1829.6265419527224f);
mapReward.put("ChMax",1832.722411332319f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
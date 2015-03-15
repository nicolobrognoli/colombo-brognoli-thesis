
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1306{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1306(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08811489674203014f);
mapReward.put("AtimeMax",0.0600545281169038f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.045078726962629524f);
mapReward.put("BtimeMax",0.0700170168079782f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.016794517112823926f);
mapReward.put("CtimeMax",0.02854247261099512f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",702.6861891990243f);
mapReward.put("AhMax",702.4058196619424f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",697.0489378668774f);
mapReward.put("BhMax",696.6172700608117f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",701.7318314237413f);
mapReward.put("ChMax",702.2283362040035f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
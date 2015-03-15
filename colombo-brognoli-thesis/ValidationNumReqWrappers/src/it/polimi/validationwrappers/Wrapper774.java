
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper774{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper774(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04795182939033049f);
mapReward.put("AtimeMax",0.06774171626759014f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.012607786033056113f);
mapReward.put("BtimeMax",0.09833719256263379f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03792168594270727f);
mapReward.put("CtimeMax",0.027895605107884414f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1233.47421072341f);
mapReward.put("AhMax",1230.3909947416337f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1228.192759273939f);
mapReward.put("BhMax",1229.8574179452723f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1231.5082244150165f);
mapReward.put("ChMax",1229.5035167746964f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
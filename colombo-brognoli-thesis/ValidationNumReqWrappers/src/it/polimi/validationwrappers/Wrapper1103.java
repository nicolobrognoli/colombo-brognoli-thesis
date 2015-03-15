
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1103{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1103(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07978237638607073f);
mapReward.put("AtimeMax",0.03833977292460929f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.026425842957490852f);
mapReward.put("BtimeMax",0.008513272028989948f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05449355768794162f);
mapReward.put("CtimeMax",0.08529931994250776f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",898.952767026913f);
mapReward.put("AhMax",906.2726522210871f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",897.5988551261759f);
mapReward.put("BhMax",899.4135117911915f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",906.7266279493851f);
mapReward.put("ChMax",904.4993734593841f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
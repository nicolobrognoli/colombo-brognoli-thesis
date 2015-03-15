
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1148{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1148(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.030062150657404106f);
mapReward.put("AtimeMax",0.06927378351671805f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.027695956011974644f);
mapReward.put("BtimeMax",0.06481883368747851f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03363034817322676f);
mapReward.put("CtimeMax",0.0100872874382554f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",854.8194400110752f);
mapReward.put("AhMax",855.5579446579055f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",855.6183403198006f);
mapReward.put("BhMax",855.4756965054567f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",858.9188614473798f);
mapReward.put("ChMax",857.6221891136786f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
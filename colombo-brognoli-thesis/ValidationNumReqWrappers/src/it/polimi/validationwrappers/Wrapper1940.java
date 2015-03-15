
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1940{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1940(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08494655455676682f);
mapReward.put("AtimeMax",0.042447238198893934f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.060069705611675184f);
mapReward.put("BtimeMax",0.07529598095205482f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.018494442815169022f);
mapReward.put("CtimeMax",0.07511361733796143f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",62.52032557965131f);
mapReward.put("AhMax",67.2788433911546f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",63.64432674010886f);
mapReward.put("BhMax",61.4306454179966f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",64.80719656079792f);
mapReward.put("ChMax",63.55495799345468f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
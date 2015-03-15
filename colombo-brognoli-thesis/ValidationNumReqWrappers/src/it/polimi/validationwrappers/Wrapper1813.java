
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1813{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1813(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0038130308432853476f);
mapReward.put("AtimeMax",0.08374742373712998f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.06297863400553673f);
mapReward.put("BtimeMax",0.008935340091912592f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",3.482196730130394E-4f);
mapReward.put("CtimeMax",0.08914529867280906f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",188.4409155387228f);
mapReward.put("AhMax",189.5269695757607f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",190.41142546350414f);
mapReward.put("BhMax",188.9497186076043f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",189.872240156442f);
mapReward.put("ChMax",196.02264105861465f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
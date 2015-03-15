
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper744{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper744(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.056552244740592415f);
mapReward.put("AtimeMax",0.016621830600670684f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.024603634707955756f);
mapReward.put("BtimeMax",0.04705667501659912f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06841176544300373f);
mapReward.put("CtimeMax",0.08909251646932692f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1259.0575373209153f);
mapReward.put("AhMax",1263.6870254784378f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1262.1051782049262f);
mapReward.put("BhMax",1258.0335580524913f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1257.6508951747592f);
mapReward.put("ChMax",1259.684052036727f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
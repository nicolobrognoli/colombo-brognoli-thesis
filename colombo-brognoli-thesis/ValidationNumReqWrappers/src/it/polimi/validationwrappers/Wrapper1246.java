
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1246{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1246(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0012667274921379535f);
mapReward.put("AtimeMax",0.08250553411872594f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.09769892077763456f);
mapReward.put("BtimeMax",0.09114210718775664f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01150882316358729f);
mapReward.put("CtimeMax",0.06321059654761382f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",754.0499878022741f);
mapReward.put("AhMax",755.2122883041131f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",755.4516634044442f);
mapReward.put("BhMax",754.8367386172372f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",758.5414118982926f);
mapReward.put("ChMax",758.3766657761527f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
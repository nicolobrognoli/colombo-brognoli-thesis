
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1411{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1411(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04371363268755466f);
mapReward.put("AtimeMax",0.0292912638910514f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.08301853610504115f);
mapReward.put("BtimeMax",0.04187107687399445f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06690380700167471f);
mapReward.put("CtimeMax",0.04618113025688305f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",597.0195646058322f);
mapReward.put("AhMax",597.5285843667025f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",596.8128539447358f);
mapReward.put("BhMax",594.0413695572744f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",596.6895172139965f);
mapReward.put("ChMax",596.3646021467306f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
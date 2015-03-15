
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper574{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper574(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.017425238521780396f);
mapReward.put("AtimeMax",0.09948340558529764f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.005192719605130025f);
mapReward.put("BtimeMax",0.0650134066074315f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09006892765539508f);
mapReward.put("CtimeMax",0.09837189663919182f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1433.2218717462367f);
mapReward.put("AhMax",1426.8484963883889f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1435.293796864229f);
mapReward.put("BhMax",1428.3477532302816f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1428.8971189350575f);
mapReward.put("ChMax",1430.2990298769344f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
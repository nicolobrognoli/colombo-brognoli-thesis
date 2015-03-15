
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper391{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper391(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05315758283244905f);
mapReward.put("AtimeMax",0.02519338661816698f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.039733776988758684f);
mapReward.put("BtimeMax",0.03251823070876127f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.061821023755213624f);
mapReward.put("CtimeMax",0.025863130337251516f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1609.8373209068016f);
mapReward.put("AhMax",1612.3833212869736f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1609.2273568808919f);
mapReward.put("BhMax",1614.5899891797726f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1612.0356464700592f);
mapReward.put("ChMax",1616.2577319869245f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
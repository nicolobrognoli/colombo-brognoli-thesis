
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1208{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1208(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07899897147124055f);
mapReward.put("AtimeMax",0.04174754718384786f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.046308323842491214f);
mapReward.put("BtimeMax",0.039634798571836646f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.018038915893890783f);
mapReward.put("CtimeMax",0.032707735786384216f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",792.7336620382911f);
mapReward.put("AhMax",793.5183066208639f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",794.1271509975876f);
mapReward.put("BhMax",800.5684986002358f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",800.10497615899f);
mapReward.put("ChMax",799.0377272911463f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper648{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper648(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.028994058933607025f);
mapReward.put("AtimeMax",0.05922697299785562f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.051919541373949184f);
mapReward.put("BtimeMax",0.03616562002885739f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.007306521661320298f);
mapReward.put("CtimeMax",0.02672394383007437f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1360.8814734883506f);
mapReward.put("AhMax",1354.1501007205618f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1361.2545966713396f);
mapReward.put("BhMax",1356.6845941873898f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1355.8013901920403f);
mapReward.put("ChMax",1352.7880626597766f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper877{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper877(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07527226204778066f);
mapReward.put("AtimeMax",0.09081321742256407f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.08308799230193029f);
mapReward.put("BtimeMax",0.03204371086400026f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07999790509971252f);
mapReward.put("CtimeMax",0.07786503361996693f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1123.2604597933548f);
mapReward.put("AhMax",1131.1844261594645f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1132.4395399015689f);
mapReward.put("BhMax",1124.561011966632f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1128.3311897063315f);
mapReward.put("ChMax",1131.1300336767088f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
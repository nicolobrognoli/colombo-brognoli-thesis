
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper868{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper868(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06685611670480755f);
mapReward.put("AtimeMax",0.05461768454139278f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.07741641529146236f);
mapReward.put("BtimeMax",0.08772108306875831f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01149353335470089f);
mapReward.put("CtimeMax",0.0861248714686548f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1137.658864732235f);
mapReward.put("AhMax",1137.747068447431f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1140.4207169971748f);
mapReward.put("BhMax",1132.6789687063292f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1141.4337479795563f);
mapReward.put("ChMax",1132.572892109945f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
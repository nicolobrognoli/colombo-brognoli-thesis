
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper65{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper65(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09547607394083758f);
mapReward.put("AtimeMax",0.05370880645018918f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.052441551833720755f);
mapReward.put("BtimeMax",0.024440043558691404f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.016385050148437406f);
mapReward.put("CtimeMax",0.03097139341063947f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1936.4048621026125f);
mapReward.put("AhMax",1936.0719386905362f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1937.9451464234396f);
mapReward.put("BhMax",1943.5285497673885f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1935.247417419783f);
mapReward.put("ChMax",1940.2072487998844f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
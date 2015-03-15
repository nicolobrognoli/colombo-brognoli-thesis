
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper71{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper71(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.049769686623493584f);
mapReward.put("AtimeMax",0.02221349004748998f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.043326094477015444f);
mapReward.put("BtimeMax",0.07800779024292728f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08540806012141045f);
mapReward.put("CtimeMax",0.06316011633493182f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1935.2789412323582f);
mapReward.put("AhMax",1936.609526146422f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1932.4934095339554f);
mapReward.put("BhMax",1934.8554657116797f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1937.0476262594425f);
mapReward.put("ChMax",1935.7197291980633f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
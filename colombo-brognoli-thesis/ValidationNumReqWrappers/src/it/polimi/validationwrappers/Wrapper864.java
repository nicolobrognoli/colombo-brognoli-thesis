
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper864{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper864(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06439766191203165f);
mapReward.put("AtimeMax",0.09611429018379966f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.007595983827483621f);
mapReward.put("BtimeMax",0.05765613448574859f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.028557702089360582f);
mapReward.put("CtimeMax",0.022175633661399397f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1144.763381403419f);
mapReward.put("AhMax",1141.9956920590646f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1138.505320448957f);
mapReward.put("BhMax",1141.2892818452697f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1141.201770137422f);
mapReward.put("ChMax",1143.1224669267826f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
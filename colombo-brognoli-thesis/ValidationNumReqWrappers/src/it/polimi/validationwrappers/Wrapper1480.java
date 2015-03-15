
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1480{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1480(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06305746598033486f);
mapReward.put("AtimeMax",0.035661182923995075f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.055038348286647984f);
mapReward.put("BtimeMax",0.003959697214107638f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07840077487156177f);
mapReward.put("CtimeMax",0.06454106501672875f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",527.2762717594253f);
mapReward.put("AhMax",526.9521364942015f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",527.2405548160073f);
mapReward.put("BhMax",520.1647234070658f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",521.6484708496265f);
mapReward.put("ChMax",524.4149381364357f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
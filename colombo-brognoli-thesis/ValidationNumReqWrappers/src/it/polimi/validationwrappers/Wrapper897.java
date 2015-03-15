
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper897{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper897(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09362839070138324f);
mapReward.put("AtimeMax",0.07746611034229171f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.030094004064238632f);
mapReward.put("BtimeMax",0.08396086614090027f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06160628778350802f);
mapReward.put("CtimeMax",0.08281397321363007f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1106.3939223213713f);
mapReward.put("AhMax",1109.4361727242344f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1103.7607680169815f);
mapReward.put("BhMax",1109.8964180879925f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1111.4394872669668f);
mapReward.put("ChMax",1107.732854917602f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1747{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1747(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.022019556004268626f);
mapReward.put("AtimeMax",0.062165943961512246f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.022323982285312405f);
mapReward.put("BtimeMax",0.07225800729937897f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01200770199832526f);
mapReward.put("CtimeMax",0.04244389280924084f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",258.10325536165175f);
mapReward.put("AhMax",256.85864734658986f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",254.6947734765051f);
mapReward.put("BhMax",261.82004123933694f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",255.43413423006044f);
mapReward.put("ChMax",262.5970748003108f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1928{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1928(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.045390434774977416f);
mapReward.put("AtimeMax",0.01186419587280746f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.054298207750551844f);
mapReward.put("BtimeMax",0.008487786915804586f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05495065926250977f);
mapReward.put("CtimeMax",0.05723084004067791f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",73.05986088970904f);
mapReward.put("AhMax",81.01974830951103f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",77.96094524939467f);
mapReward.put("BhMax",77.28187086454976f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",72.58820245582238f);
mapReward.put("ChMax",73.79008668753276f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper79{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper79(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.037394598882404595f);
mapReward.put("AtimeMax",0.0063999513630573325f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.02241786455979523f);
mapReward.put("BtimeMax",0.05160805257936257f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01916533607551365f);
mapReward.put("CtimeMax",0.06375781961831492f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1928.8419150470024f);
mapReward.put("AhMax",1926.6437859763791f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1924.7029359818944f);
mapReward.put("BhMax",1922.64891751038f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1924.2935796352376f);
mapReward.put("ChMax",1929.947391866341f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
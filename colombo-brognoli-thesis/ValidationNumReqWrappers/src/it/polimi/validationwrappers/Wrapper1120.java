
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1120{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1120(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.040003871856808995f);
mapReward.put("AtimeMax",0.03206306649492209f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",6.809915856282323E-4f);
mapReward.put("BtimeMax",0.016226541046221777f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04152233873593064f);
mapReward.put("CtimeMax",0.011347771715201006f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",881.2830910753601f);
mapReward.put("AhMax",886.6043489982625f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",881.7464585820563f);
mapReward.put("BhMax",882.4723905632992f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",888.1718626229202f);
mapReward.put("ChMax",883.7873647784354f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
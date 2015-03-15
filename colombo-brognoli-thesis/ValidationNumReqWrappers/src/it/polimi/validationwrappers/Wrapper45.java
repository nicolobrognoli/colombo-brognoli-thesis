
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper45{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper45(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.062273063055934344f);
mapReward.put("AtimeMax",0.028392289537950265f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.010383388878722977f);
mapReward.put("BtimeMax",0.0016656715118819499f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0023960743274252573f);
mapReward.put("CtimeMax",0.02720162798716146f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1957.34035418307f);
mapReward.put("AhMax",1960.1145451632428f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1964.2539883446618f);
mapReward.put("BhMax",1963.5941519791847f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1956.1147199367215f);
mapReward.put("ChMax",1956.3277664661507f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
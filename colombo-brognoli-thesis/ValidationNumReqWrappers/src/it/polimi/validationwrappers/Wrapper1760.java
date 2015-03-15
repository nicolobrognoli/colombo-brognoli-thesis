
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1760{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1760(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08564040202748521f);
mapReward.put("AtimeMax",0.030976854465344462f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.006496904261125991f);
mapReward.put("BtimeMax",0.02226102877627566f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08206276332555983f);
mapReward.put("CtimeMax",0.011688574807383978f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",240.12508414571718f);
mapReward.put("AhMax",248.3780360490927f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",241.7055337595789f);
mapReward.put("BhMax",248.6881064428436f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",245.67466682858844f);
mapReward.put("ChMax",241.08866274537405f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
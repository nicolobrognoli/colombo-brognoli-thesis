
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper143{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper143(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07675140553889688f);
mapReward.put("AtimeMax",0.0227456727580704f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.043337806497619535f);
mapReward.put("BtimeMax",0.05915103631557742f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09319755257963026f);
mapReward.put("CtimeMax",0.08402470821895874f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1861.6038976764316f);
mapReward.put("AhMax",1863.3323647182451f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1859.693023482092f);
mapReward.put("BhMax",1864.4206709659325f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1859.24533477692f);
mapReward.put("ChMax",1857.7720464922243f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
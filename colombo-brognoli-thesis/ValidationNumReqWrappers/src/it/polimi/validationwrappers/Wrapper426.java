
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper426{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper426(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07158397872201198f);
mapReward.put("AtimeMax",0.051215567963195555f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.031752227697697f);
mapReward.put("BtimeMax",0.024567270226375237f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05616890710961907f);
mapReward.put("CtimeMax",0.02569105923734486f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1574.115180805475f);
mapReward.put("AhMax",1576.8568247748804f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1580.5613945016219f);
mapReward.put("BhMax",1577.3161520090716f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1579.1569419195066f);
mapReward.put("ChMax",1582.4423377835365f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper259{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper259(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03755762262828938f);
mapReward.put("AtimeMax",0.029356987304478666f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.00630446629407364f);
mapReward.put("BtimeMax",0.08574856896661703f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.026767852374477975f);
mapReward.put("CtimeMax",0.0015867641292932832f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1748.0260667058092f);
mapReward.put("AhMax",1746.3815337269375f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1741.2352534305187f);
mapReward.put("BhMax",1748.3693626430593f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1750.3343529146591f);
mapReward.put("ChMax",1744.6365289366483f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
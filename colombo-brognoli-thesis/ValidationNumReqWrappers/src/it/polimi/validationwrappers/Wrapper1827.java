
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1827{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1827(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04490630013689262f);
mapReward.put("AtimeMax",0.05059751546484168f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.053118536784373324f);
mapReward.put("BtimeMax",0.09122498896416317f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04866106326490157f);
mapReward.put("CtimeMax",0.02580783992003428f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",179.51747966323165f);
mapReward.put("AhMax",173.50363813749524f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",173.35457399516577f);
mapReward.put("BhMax",179.0335333528119f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",181.8117179470285f);
mapReward.put("ChMax",181.65519280225183f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
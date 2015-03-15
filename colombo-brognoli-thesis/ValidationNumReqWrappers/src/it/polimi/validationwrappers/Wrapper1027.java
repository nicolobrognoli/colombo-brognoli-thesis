
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1027{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1027(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.009172554176129211f);
mapReward.put("AtimeMax",0.09488725118855677f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.019662709154679003f);
mapReward.put("BtimeMax",0.09317437835118828f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05627518993031574f);
mapReward.put("CtimeMax",0.00911431649907476f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",977.9114065600008f);
mapReward.put("AhMax",979.6915271813867f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",977.2220606818886f);
mapReward.put("BhMax",982.3506516793728f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",981.5035285825625f);
mapReward.put("ChMax",977.1958019767134f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
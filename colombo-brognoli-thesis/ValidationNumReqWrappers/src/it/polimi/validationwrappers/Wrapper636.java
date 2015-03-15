
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper636{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper636(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.011664917971800626f);
mapReward.put("AtimeMax",0.01664610559916574f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.009406424462918695f);
mapReward.put("BtimeMax",0.0847125086865779f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03704117532394132f);
mapReward.put("CtimeMax",0.027403679528821546f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1370.4654428356075f);
mapReward.put("AhMax",1370.295245055183f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1365.1748849830765f);
mapReward.put("BhMax",1370.74768935634f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1369.6757187890544f);
mapReward.put("ChMax",1364.9647442662279f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
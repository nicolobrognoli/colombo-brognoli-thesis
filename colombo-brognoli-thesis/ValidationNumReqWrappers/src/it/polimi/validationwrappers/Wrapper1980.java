
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1980{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1980(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.012491498338093366f);
mapReward.put("AtimeMax",0.07741069237767605f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.023341024914601306f);
mapReward.put("BtimeMax",0.09766676325604692f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.017918710727362386f);
mapReward.put("CtimeMax",0.07636790065275476f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",28.936758411323254f);
mapReward.put("AhMax",27.601644061340092f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",24.323997657772672f);
mapReward.put("BhMax",21.53955870469277f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",29.335033255392364f);
mapReward.put("ChMax",20.071308064649763f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
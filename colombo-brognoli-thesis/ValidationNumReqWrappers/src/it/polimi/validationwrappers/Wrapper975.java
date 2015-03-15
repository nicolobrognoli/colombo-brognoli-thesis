
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper975{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper975(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.014814905569170922f);
mapReward.put("AtimeMax",0.07115202024183787f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.015203098747402888f);
mapReward.put("BtimeMax",0.03262834181056706f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05297454872576277f);
mapReward.put("CtimeMax",0.045349604783616514f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1027.9099967971945f);
mapReward.put("AhMax",1032.2325674029607f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1030.995769631686f);
mapReward.put("BhMax",1034.0169464513942f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1029.7502750154927f);
mapReward.put("ChMax",1029.1776456596f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
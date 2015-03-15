
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1516{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1516(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03267590442797354f);
mapReward.put("AtimeMax",0.004990555311834488f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.020416101732043047f);
mapReward.put("BtimeMax",0.017536476909089126f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08163427137893296f);
mapReward.put("CtimeMax",0.007206887983174171f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",484.74921288782446f);
mapReward.put("AhMax",489.4343007488142f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",487.9080688701868f);
mapReward.put("BhMax",489.5133702514784f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",492.9990143030153f);
mapReward.put("ChMax",489.3678562901054f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper217{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper217(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0373520094032363f);
mapReward.put("AtimeMax",0.008779910371712652f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.054557678156321746f);
mapReward.put("BtimeMax",0.021020959282531726f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07312557791201982f);
mapReward.put("CtimeMax",0.0732259212949077f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1787.2102542533667f);
mapReward.put("AhMax",1791.4726607571179f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1784.2815761850986f);
mapReward.put("BhMax",1790.691385404371f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1791.6239935757415f);
mapReward.put("ChMax",1785.1401418987143f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1203{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1203(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.052780774885772874f);
mapReward.put("AtimeMax",0.05268445407522108f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.086693552426931f);
mapReward.put("BtimeMax",0.0381352398429874f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06792060626651919f);
mapReward.put("CtimeMax",0.020597092707989095f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",804.7416585450104f);
mapReward.put("AhMax",803.7236056833073f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",805.9923961243777f);
mapReward.put("BhMax",803.8615462106197f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",802.6435458353179f);
mapReward.put("ChMax",804.8218571566941f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
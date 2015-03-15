
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1601{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1601(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06096645872035368f);
mapReward.put("AtimeMax",0.04479621220514757f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.003711210040954915f);
mapReward.put("BtimeMax",0.031112258187637708f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.027094413573572052f);
mapReward.put("CtimeMax",0.04186994047462674f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",408.1204731423402f);
mapReward.put("AhMax",401.0704801070437f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",408.12271321925715f);
mapReward.put("BhMax",407.3489792739326f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",402.8023287895894f);
mapReward.put("ChMax",401.970411515331f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
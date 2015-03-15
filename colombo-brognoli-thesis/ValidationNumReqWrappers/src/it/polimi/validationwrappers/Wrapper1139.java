
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1139{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1139(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.051830599308273315f);
mapReward.put("AtimeMax",0.04181934789493712f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.03631488666733111f);
mapReward.put("BtimeMax",0.041302251042192505f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07337661785538875f);
mapReward.put("CtimeMax",0.08357312978600664f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",863.4709221863108f);
mapReward.put("AhMax",865.0585962749899f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",870.8314478786668f);
mapReward.put("BhMax",865.9892340124151f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",862.7347427531187f);
mapReward.put("ChMax",867.3485149335017f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
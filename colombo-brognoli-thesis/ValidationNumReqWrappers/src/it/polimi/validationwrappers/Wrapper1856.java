
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1856{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1856(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",8.141867885623655E-4f);
mapReward.put("AtimeMax",0.08408691227350763f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.050564875542046986f);
mapReward.put("BtimeMax",0.03617385497036683f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09516312448962197f);
mapReward.put("CtimeMax",0.008380563165722454f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",149.99837845919635f);
mapReward.put("AhMax",151.75209061509798f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",151.37272748339348f);
mapReward.put("BhMax",144.76017930139253f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",149.58491988437788f);
mapReward.put("ChMax",149.81461096588637f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
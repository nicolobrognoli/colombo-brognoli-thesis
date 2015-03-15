
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper625{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper625(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.01514102299786152f);
mapReward.put("AtimeMax",0.016121082592916093f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.009663373447892688f);
mapReward.put("BtimeMax",0.07483550082474273f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06565245520453265f);
mapReward.put("CtimeMax",0.053904368768004154f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1380.5247856332116f);
mapReward.put("AhMax",1381.073418662169f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1381.8162072980765f);
mapReward.put("BhMax",1379.3844660727357f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1383.25216344309f);
mapReward.put("ChMax",1379.9120548637206f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
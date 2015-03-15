
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper856{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper856(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.004977058152576608f);
mapReward.put("AtimeMax",0.09193019454232909f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.002976206799280445f);
mapReward.put("BtimeMax",0.02947713505596945f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03693455918179058f);
mapReward.put("CtimeMax",0.05996945005370506f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1153.5620577585864f);
mapReward.put("AhMax",1147.4461297786004f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1147.6809782800367f);
mapReward.put("BhMax",1150.6758438465902f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1152.19930363304f);
mapReward.put("ChMax",1152.9361984419784f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
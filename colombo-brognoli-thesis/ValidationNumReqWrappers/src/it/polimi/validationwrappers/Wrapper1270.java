
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1270{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1270(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06770370692423947f);
mapReward.put("AtimeMax",0.07250215241624165f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.008184909847102417f);
mapReward.put("BtimeMax",0.05207530618058702f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.016654027997969622f);
mapReward.put("CtimeMax",0.0010878721312940875f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",738.5316997554555f);
mapReward.put("AhMax",735.8386179480201f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",733.8033006205218f);
mapReward.put("BhMax",732.0620557161794f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",738.8738973173677f);
mapReward.put("ChMax",738.9370010658802f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
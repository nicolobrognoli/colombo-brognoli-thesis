
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1364{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1364(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08705154970951715f);
mapReward.put("AtimeMax",0.02789851447929338f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.053354997211042476f);
mapReward.put("BtimeMax",0.094605860853023f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.008478988186787462f);
mapReward.put("CtimeMax",0.07683504870756296f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",637.0860856253003f);
mapReward.put("AhMax",639.6064526024152f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",641.0468088082969f);
mapReward.put("BhMax",639.1492968039086f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",638.0820556576557f);
mapReward.put("ChMax",645.2685367574566f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
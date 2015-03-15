
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1072{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1072(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02993824928903722f);
mapReward.put("AtimeMax",0.062215534886082745f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.031689922606454236f);
mapReward.put("BtimeMax",0.07531067948701965f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04536904994128179f);
mapReward.put("CtimeMax",0.07777749500305686f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",934.4094760303107f);
mapReward.put("AhMax",934.2673971161192f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",934.9249600523475f);
mapReward.put("BhMax",929.3370424892724f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",931.9636771604497f);
mapReward.put("ChMax",929.5952124106669f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
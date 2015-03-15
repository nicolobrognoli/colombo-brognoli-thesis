
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper787{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper787(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0013272934936410575f);
mapReward.put("AtimeMax",0.08484467044833986f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",9.193905835551241E-4f);
mapReward.put("BtimeMax",0.06723885762635201f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0857306896412252f);
mapReward.put("CtimeMax",0.014587882742157832f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1216.2397849843637f);
mapReward.put("AhMax",1220.0209336088226f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1216.685657285312f);
mapReward.put("BhMax",1215.572758110569f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1222.2616364401342f);
mapReward.put("ChMax",1213.043111699146f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1462{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1462(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.049850220959440736f);
mapReward.put("AtimeMax",0.018099200456681473f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.018350230404153324f);
mapReward.put("BtimeMax",0.03768410298802065f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01859647343709623f);
mapReward.put("CtimeMax",0.018703545148511812f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",546.3844448368004f);
mapReward.put("AhMax",541.9265208180858f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",547.9148613114993f);
mapReward.put("BhMax",547.8609342776263f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",546.5264662907445f);
mapReward.put("ChMax",544.2546004284451f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
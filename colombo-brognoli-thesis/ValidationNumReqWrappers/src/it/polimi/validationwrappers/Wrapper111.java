
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper111{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper111(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.013732848444023404f);
mapReward.put("AtimeMax",0.050269330390184094f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.020836592522248842f);
mapReward.put("BtimeMax",0.022985914670153207f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.016709545705471472f);
mapReward.put("CtimeMax",0.03411638057736864f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1894.9524612887474f);
mapReward.put("AhMax",1891.566262414523f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1896.0841288375964f);
mapReward.put("BhMax",1896.9677796214344f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1889.4738546926578f);
mapReward.put("ChMax",1889.9560359904538f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
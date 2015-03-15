
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper791{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper791(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.01181118382736993f);
mapReward.put("AtimeMax",0.034120197736358306f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.034522919454999614f);
mapReward.put("BtimeMax",0.034505013552674324f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03429761549416469f);
mapReward.put("CtimeMax",0.05091780968600905f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1216.9493709159947f);
mapReward.put("AhMax",1211.5471777585992f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1212.2985040826384f);
mapReward.put("BhMax",1212.9235927080247f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1212.6475445722895f);
mapReward.put("ChMax",1210.2781873704284f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
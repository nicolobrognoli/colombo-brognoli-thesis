
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper370{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper370(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05121013088123353f);
mapReward.put("AtimeMax",0.006200620176461613f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.055243103661965845f);
mapReward.put("BtimeMax",0.014319214814358572f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0521843460799911f);
mapReward.put("CtimeMax",0.08045026838709633f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1632.7385558743767f);
mapReward.put("AhMax",1632.9146560240679f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1634.82238539499f);
mapReward.put("BhMax",1634.5501418526087f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1636.3524648419118f);
mapReward.put("ChMax",1635.8070982335717f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
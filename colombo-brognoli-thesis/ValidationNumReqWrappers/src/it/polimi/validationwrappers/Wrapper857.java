
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper857{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper857(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03831002822596713f);
mapReward.put("AtimeMax",0.04900296236660949f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.08937500297523224f);
mapReward.put("BtimeMax",0.0343450829096056f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.023728147932905997f);
mapReward.put("CtimeMax",0.06044639947808379f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1151.5146318390487f);
mapReward.put("AhMax",1147.2761906889657f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1148.885982222371f);
mapReward.put("BhMax",1147.5123457265854f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1149.6789075602046f);
mapReward.put("ChMax",1143.0098727304658f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
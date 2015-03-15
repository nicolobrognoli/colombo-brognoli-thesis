
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper860{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper860(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07277058179463175f);
mapReward.put("AtimeMax",0.0021603402016876715f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.023644746624050816f);
mapReward.put("BtimeMax",0.048542958247096f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08330194217385008f);
mapReward.put("CtimeMax",0.08812845517695003f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1144.4574059333092f);
mapReward.put("AhMax",1140.8138394771745f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1144.9891048226348f);
mapReward.put("BhMax",1142.2627059200652f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1143.3168649353556f);
mapReward.put("ChMax",1148.6655751829712f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
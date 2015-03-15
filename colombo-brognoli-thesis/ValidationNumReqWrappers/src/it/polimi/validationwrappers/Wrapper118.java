
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper118{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper118(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.022487073910925404f);
mapReward.put("AtimeMax",0.03731190663016556f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.048711599978191154f);
mapReward.put("BtimeMax",0.0909922092236819f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07742400891445043f);
mapReward.put("CtimeMax",8.41394805406126E-5f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1887.5529285033779f);
mapReward.put("AhMax",1884.3269042331042f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1890.9075638506388f);
mapReward.put("BhMax",1890.7807945364004f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1886.1390353982804f);
mapReward.put("ChMax",1888.7493954565375f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
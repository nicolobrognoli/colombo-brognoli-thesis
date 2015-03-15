
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1435{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1435(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08227479903726054f);
mapReward.put("AtimeMax",0.04025302794543519f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.029441037325712217f);
mapReward.put("BtimeMax",0.06985937824771049f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.00698856097266789f);
mapReward.put("CtimeMax",0.07929820568540116f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",570.8388423585236f);
mapReward.put("AhMax",567.4182350096736f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",565.2879122856968f);
mapReward.put("BhMax",567.4831481276923f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",566.6514321939566f);
mapReward.put("ChMax",573.5607724897469f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
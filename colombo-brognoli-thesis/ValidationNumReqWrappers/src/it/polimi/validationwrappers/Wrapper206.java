
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper206{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper206(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09792190433235562f);
mapReward.put("AtimeMax",0.08303418987382573f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.007254538300468738f);
mapReward.put("BtimeMax",0.08652280261818439f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03462921369535489f);
mapReward.put("CtimeMax",0.0451416116461168f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1802.3394878582628f);
mapReward.put("AhMax",1798.7576033501073f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1797.8219856417597f);
mapReward.put("BhMax",1794.9900577564224f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1794.251223574637f);
mapReward.put("ChMax",1803.6828278786074f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper12{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper12(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.009450093737059729f);
mapReward.put("AtimeMax",0.05410272300331781f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.02825445062240539f);
mapReward.put("BtimeMax",0.028788188183469697f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03247433487271957f);
mapReward.put("CtimeMax",0.09305320325401754f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1988.114747561319f);
mapReward.put("AhMax",1996.6355591241654f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1990.190124036165f);
mapReward.put("BhMax",1988.629186693671f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1995.2981713744296f);
mapReward.put("ChMax",1997.9453466978684f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
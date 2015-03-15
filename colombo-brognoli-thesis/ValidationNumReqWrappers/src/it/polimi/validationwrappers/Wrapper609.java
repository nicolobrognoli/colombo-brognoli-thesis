
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper609{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper609(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.021197522294796167f);
mapReward.put("AtimeMax",0.007532735228672993f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.010052239164386068f);
mapReward.put("BtimeMax",0.02683353052520492f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",7.368560557268645E-4f);
mapReward.put("CtimeMax",0.037627725095793776f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1400.3886795629005f);
mapReward.put("AhMax",1400.7708325813228f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1391.2631634556947f);
mapReward.put("BhMax",1392.4852600149757f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1397.3601803628917f);
mapReward.put("ChMax",1395.4311028518014f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
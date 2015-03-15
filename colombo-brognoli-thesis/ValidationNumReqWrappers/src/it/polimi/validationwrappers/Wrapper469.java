
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper469{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper469(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",4.570107691260872E-4f);
mapReward.put("AtimeMax",0.051276565124466676f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.004378581417312488f);
mapReward.put("BtimeMax",0.011686344170188767f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.014227594446452085f);
mapReward.put("CtimeMax",0.02449240167724328f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1537.0439746518766f);
mapReward.put("AhMax",1539.75707923151f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1538.559339715758f);
mapReward.put("BhMax",1540.4884771167378f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1533.5447904113553f);
mapReward.put("ChMax",1535.3270362426322f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
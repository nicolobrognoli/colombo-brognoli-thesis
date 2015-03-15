
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper249{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper249(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0752978241985538f);
mapReward.put("AtimeMax",0.08191404258750679f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.048314154152613364f);
mapReward.put("BtimeMax",0.0874086409041897f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03110412439207514f);
mapReward.put("CtimeMax",0.042679431953900726f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1755.6882871178254f);
mapReward.put("AhMax",1751.7613626185032f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1755.0409835431003f);
mapReward.put("BhMax",1760.5092132648335f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1756.9477918162247f);
mapReward.put("ChMax",1756.4257340440026f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
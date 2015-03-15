
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper253{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper253(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.027868201497710476f);
mapReward.put("AtimeMax",0.07750478284426945f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.046677282988437784f);
mapReward.put("BtimeMax",0.06333298357439009f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09356019086671481f);
mapReward.put("CtimeMax",0.016165060120521f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1750.4241495081765f);
mapReward.put("AhMax",1747.001723812094f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1747.0202989272957f);
mapReward.put("BhMax",1756.8414169321968f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1755.9300930370891f);
mapReward.put("ChMax",1756.8969313183288f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
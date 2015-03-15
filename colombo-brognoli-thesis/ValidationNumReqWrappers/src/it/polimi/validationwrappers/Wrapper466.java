
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper466{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper466(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.027285306154948397f);
mapReward.put("AtimeMax",0.08906626033142598f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.022077920722171195f);
mapReward.put("BtimeMax",0.01712301048391307f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09185678256020866f);
mapReward.put("CtimeMax",0.04779570457329757f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1543.5831326421232f);
mapReward.put("AhMax",1534.7576042942587f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1537.344843427005f);
mapReward.put("BhMax",1539.610370751866f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1536.1898482891745f);
mapReward.put("ChMax",1540.0639912834538f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
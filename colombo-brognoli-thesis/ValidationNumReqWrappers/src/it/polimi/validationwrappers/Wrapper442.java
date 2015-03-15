
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper442{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper442(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08194412837197307f);
mapReward.put("AtimeMax",0.0302283326504607f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.05394931227311247f);
mapReward.put("BtimeMax",0.09643399203988164f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02402858175275352f);
mapReward.put("CtimeMax",0.0910874619617927f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1566.4250509424148f);
mapReward.put("AhMax",1567.2506614986526f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1566.4613929586671f);
mapReward.put("BhMax",1560.9133672133303f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1560.5472286299025f);
mapReward.put("ChMax",1564.12875330473f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
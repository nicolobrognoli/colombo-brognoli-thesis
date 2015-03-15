
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper53{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper53(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09583736598149586f);
mapReward.put("AtimeMax",0.037129129517495384f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.049151977075107864f);
mapReward.put("BtimeMax",0.027681634536509993f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.032734947994345266f);
mapReward.put("CtimeMax",0.018612636871971323f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1951.1848110060423f);
mapReward.put("AhMax",1947.305552322656f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1956.7198861884954f);
mapReward.put("BhMax",1947.994560229295f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1949.9914591504148f);
mapReward.put("ChMax",1952.0512188562118f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
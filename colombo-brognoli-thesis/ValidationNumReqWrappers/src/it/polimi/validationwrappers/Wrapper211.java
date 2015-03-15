
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper211{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper211(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05759940460412968f);
mapReward.put("AtimeMax",0.06368355398130424f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.008541406615135583f);
mapReward.put("BtimeMax",0.005965738947996235f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03084966623717107f);
mapReward.put("CtimeMax",0.0700133393457543f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1791.9943810942375f);
mapReward.put("AhMax",1791.918977133529f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1792.4831246077138f);
mapReward.put("BhMax",1789.9638688890661f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1795.8863330475513f);
mapReward.put("ChMax",1792.263209844754f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
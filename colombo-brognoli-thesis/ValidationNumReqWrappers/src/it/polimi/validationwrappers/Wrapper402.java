
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper402{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper402(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07540936826226999f);
mapReward.put("AtimeMax",3.4255144481560863E-4f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.09818469638651679f);
mapReward.put("BtimeMax",0.012627797184569712f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07742983762135083f);
mapReward.put("CtimeMax",0.06003270172201138f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1601.8164587619851f);
mapReward.put("AhMax",1601.9617740161739f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1604.9071651204947f);
mapReward.put("BhMax",1606.5410138004104f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1600.8578754457183f);
mapReward.put("ChMax",1607.8151806354076f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
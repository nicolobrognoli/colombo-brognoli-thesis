
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper997{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper997(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.01804377296873767f);
mapReward.put("AtimeMax",0.07420554178667706f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.06550786047486988f);
mapReward.put("BtimeMax",0.07489336304052475f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02154303504308751f);
mapReward.put("CtimeMax",0.03640976640356082f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1010.5111128132559f);
mapReward.put("AhMax",1011.2280450325807f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1006.4242970634529f);
mapReward.put("BhMax",1012.707835471126f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1009.4895484230938f);
mapReward.put("ChMax",1010.016882592398f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1082{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1082(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.074652759965937f);
mapReward.put("AtimeMax",0.0061283452952130115f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.035613703954075024f);
mapReward.put("BtimeMax",0.00834531806380714f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.017511018509983f);
mapReward.put("CtimeMax",0.02890650098159452f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",924.4428072450014f);
mapReward.put("AhMax",918.620315283064f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",926.7562749499288f);
mapReward.put("BhMax",923.4753928296466f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",927.6597927155368f);
mapReward.put("ChMax",921.8451586016902f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
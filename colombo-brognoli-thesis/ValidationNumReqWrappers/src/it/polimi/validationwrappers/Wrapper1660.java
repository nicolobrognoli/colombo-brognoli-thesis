
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1660{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1660(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03294121822753734f);
mapReward.put("AtimeMax",0.01599270946088709f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.049162772660452526f);
mapReward.put("BtimeMax",0.06239019973236898f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.02455929673081164f);
mapReward.put("CtimeMax",0.05827404234965613f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",340.761383575355f);
mapReward.put("AhMax",347.6978401073663f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",348.78869599584743f);
mapReward.put("BhMax",342.3937428138545f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",349.6163596415754f);
mapReward.put("ChMax",341.1376190337618f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
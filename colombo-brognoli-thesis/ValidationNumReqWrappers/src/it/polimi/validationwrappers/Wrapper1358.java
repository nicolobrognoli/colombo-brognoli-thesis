
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1358{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1358(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07883889799719332f);
mapReward.put("AtimeMax",0.04894223304432521f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.001731434969975998f);
mapReward.put("BtimeMax",0.0995464470550156f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0706188140045339f);
mapReward.put("CtimeMax",0.00593877289310738f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",651.099412079266f);
mapReward.put("AhMax",644.4058767032066f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",647.7940345720348f);
mapReward.put("BhMax",644.8186693621162f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",644.1319849957615f);
mapReward.put("ChMax",645.6814448321479f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
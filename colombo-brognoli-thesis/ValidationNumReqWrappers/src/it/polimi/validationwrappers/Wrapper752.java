
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper752{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper752(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09264083859880426f);
mapReward.put("AtimeMax",0.07876705594171408f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.048830536173016484f);
mapReward.put("BtimeMax",0.0015361295224719073f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03637079615277737f);
mapReward.put("CtimeMax",0.06406020478312482f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1254.8793305298514f);
mapReward.put("AhMax",1256.853878617274f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1248.6808884064694f);
mapReward.put("BhMax",1255.2883822188323f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1255.485932807919f);
mapReward.put("ChMax",1248.9731105819944f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
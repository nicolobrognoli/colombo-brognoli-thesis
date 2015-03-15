
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1829{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1829(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08394022500369291f);
mapReward.put("AtimeMax",0.09227745252313048f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.06770549348152856f);
mapReward.put("BtimeMax",0.01523727472357288f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06688160532894699f);
mapReward.put("CtimeMax",0.06808141697940082f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",177.40355515939754f);
mapReward.put("AhMax",177.4915281107148f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",171.7410436340159f);
mapReward.put("BhMax",172.38155787011576f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",178.08165945620112f);
mapReward.put("ChMax",172.63186985079108f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
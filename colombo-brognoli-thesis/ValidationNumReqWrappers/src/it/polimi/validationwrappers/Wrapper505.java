
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper505{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper505(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05129365421388944f);
mapReward.put("AtimeMax",0.062204325714687723f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.017139041073686155f);
mapReward.put("BtimeMax",0.05735221628835888f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.011521138298501165f);
mapReward.put("CtimeMax",0.053136363963904906f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1499.3861919040432f);
mapReward.put("AhMax",1495.6886789025164f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1500.0240243550495f);
mapReward.put("BhMax",1500.4007066410804f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1495.762258793242f);
mapReward.put("ChMax",1499.7463901733822f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
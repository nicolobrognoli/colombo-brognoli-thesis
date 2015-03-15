
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1659{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1659(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08377004983197565f);
mapReward.put("AtimeMax",0.07980470324410605f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.033267531597552503f);
mapReward.put("BtimeMax",0.062410610939835943f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07111038205688264f);
mapReward.put("CtimeMax",0.06860843817932985f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",348.2373927231289f);
mapReward.put("AhMax",341.36199584236124f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",341.7071346732416f);
mapReward.put("BhMax",342.4014930629239f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",344.82230536359737f);
mapReward.put("ChMax",347.9760075106501f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
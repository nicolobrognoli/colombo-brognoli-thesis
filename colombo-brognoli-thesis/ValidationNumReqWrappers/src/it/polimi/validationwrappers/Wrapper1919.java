
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1919{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1919(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05103767033325819f);
mapReward.put("AtimeMax",0.028796856479073006f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.03179044838215058f);
mapReward.put("BtimeMax",0.03994439498207003f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06348781545490416f);
mapReward.put("CtimeMax",0.022274723214757174f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",85.8248853985496f);
mapReward.put("AhMax",85.4109994757969f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",88.6508190031438f);
mapReward.put("BhMax",81.5752561112369f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",87.81056748571167f);
mapReward.put("ChMax",90.55912650205232f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
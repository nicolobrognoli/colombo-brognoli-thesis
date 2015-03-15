
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper731{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper731(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0277944439393782f);
mapReward.put("AtimeMax",0.007935990379258916f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.020595221958868936f);
mapReward.put("BtimeMax",0.09634701585909178f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05501067517174334f);
mapReward.put("CtimeMax",0.09034459932404826f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1275.8713160053499f);
mapReward.put("AhMax",1277.7323336858308f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1272.7124237246999f);
mapReward.put("BhMax",1274.577893026888f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1274.82341740158f);
mapReward.put("ChMax",1269.644263365882f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
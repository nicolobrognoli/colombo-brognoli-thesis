
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1266{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1266(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06959716332666113f);
mapReward.put("AtimeMax",0.05545758908847043f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.049853220753356534f);
mapReward.put("BtimeMax",0.003945405698508486f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.013469057830871356f);
mapReward.put("CtimeMax",0.060397454295290386f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",736.8192674884988f);
mapReward.put("AhMax",737.2381380856207f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",740.7891993334608f);
mapReward.put("BhMax",738.9874742240277f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",735.9725020138842f);
mapReward.put("ChMax",743.4658275183077f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
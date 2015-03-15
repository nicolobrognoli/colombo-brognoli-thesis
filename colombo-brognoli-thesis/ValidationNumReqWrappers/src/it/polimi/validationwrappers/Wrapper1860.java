
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1860{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1860(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.017765142527388256f);
mapReward.put("AtimeMax",0.03690705160115086f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.026202443919501283f);
mapReward.put("BtimeMax",0.008289028375322315f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0893303097711022f);
mapReward.put("CtimeMax",0.09209785029458359f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",148.51322495492462f);
mapReward.put("AhMax",144.93512392536056f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",141.90868723832463f);
mapReward.put("BhMax",142.91218123342694f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",143.58674035649838f);
mapReward.put("ChMax",148.11507453523024f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
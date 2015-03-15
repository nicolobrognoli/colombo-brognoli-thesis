
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper463{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper463(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.028191895701217294f);
mapReward.put("AtimeMax",0.09907396191194927f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.047487604983226864f);
mapReward.put("BtimeMax",0.09551698134867778f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.022244712708154202f);
mapReward.put("CtimeMax",0.07692022617791353f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1538.079513333732f);
mapReward.put("AhMax",1543.1400698477491f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1544.7562635545542f);
mapReward.put("BhMax",1542.413322977765f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1539.9487072365705f);
mapReward.put("ChMax",1544.0105954021606f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
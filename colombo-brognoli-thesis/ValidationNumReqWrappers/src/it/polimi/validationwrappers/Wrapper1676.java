
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1676{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1676(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02630574624658679f);
mapReward.put("AtimeMax",0.044218948794923905f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.014642875336142724f);
mapReward.put("BtimeMax",0.06462514988804338f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.013412542907236457f);
mapReward.put("CtimeMax",0.033419984149510605f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",333.2886311280127f);
mapReward.put("AhMax",333.38595216471424f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",329.36391946649144f);
mapReward.put("BhMax",330.4629378688239f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",325.69920362014324f);
mapReward.put("ChMax",329.21849327821997f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
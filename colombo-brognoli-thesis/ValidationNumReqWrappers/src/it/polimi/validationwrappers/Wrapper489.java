
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper489{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper489(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07478975955070372f);
mapReward.put("AtimeMax",0.004705652768552904f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.010305890233818482f);
mapReward.put("BtimeMax",0.048538440173774865f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.011388088286167098f);
mapReward.put("CtimeMax",0.0607928567433312f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1512.3260937381933f);
mapReward.put("AhMax",1518.1743597698166f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1520.292903378688f);
mapReward.put("BhMax",1514.6603586302683f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1516.637356461059f);
mapReward.put("ChMax",1513.9031416258508f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
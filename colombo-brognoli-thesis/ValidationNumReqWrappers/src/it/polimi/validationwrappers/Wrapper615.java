
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper615{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper615(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.040024266251893294f);
mapReward.put("AtimeMax",0.04424045315131734f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.021796598693981317f);
mapReward.put("BtimeMax",0.07973461627278962f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0062093404991042656f);
mapReward.put("CtimeMax",0.014224353514121301f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1390.924668977115f);
mapReward.put("AhMax",1393.6306807674246f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1392.5478594158687f);
mapReward.put("BhMax",1390.2256395745503f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1390.2215997172448f);
mapReward.put("ChMax",1386.1905323758124f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
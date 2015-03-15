
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1382{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1382(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03721495760498724f);
mapReward.put("AtimeMax",0.035474857911662924f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",7.73135329585084E-4f);
mapReward.put("BtimeMax",0.00868523011315273f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04147468951617935f);
mapReward.put("CtimeMax",0.07210516474963484f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",626.5615287952315f);
mapReward.put("AhMax",624.3321135184351f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",618.8532878705024f);
mapReward.put("BhMax",619.3228670608182f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",622.0344559442194f);
mapReward.put("ChMax",626.071028167175f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1821{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1821(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09908284960616477f);
mapReward.put("AtimeMax",0.05281060500239809f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.078269247169476f);
mapReward.put("BtimeMax",0.051391070063580194f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.011796368522613987f);
mapReward.put("CtimeMax",0.06401129495068719f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",180.8701856486314f);
mapReward.put("AhMax",184.35547068796888f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",185.2352487311158f);
mapReward.put("BhMax",179.90524256711043f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",186.86175380913033f);
mapReward.put("ChMax",185.73588021397237f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
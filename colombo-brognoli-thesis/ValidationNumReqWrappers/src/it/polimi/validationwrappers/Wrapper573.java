
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper573{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper573(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09151909943362105f);
mapReward.put("AtimeMax",0.05299145710948576f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.004819945790150526f);
mapReward.put("BtimeMax",0.02762136286469693f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07693480488415716f);
mapReward.put("CtimeMax",0.06342632758178077f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1434.5154472152199f);
mapReward.put("AhMax",1428.8739368686665f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1428.8039124873471f);
mapReward.put("BhMax",1435.627991330565f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1433.5326737197013f);
mapReward.put("ChMax",1430.8758450993978f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
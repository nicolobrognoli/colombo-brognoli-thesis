
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper372{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper372(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0948378559748452f);
mapReward.put("AtimeMax",0.0033349299741136985f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.033917680556229145f);
mapReward.put("BtimeMax",0.002708124364425857f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09406632618266283f);
mapReward.put("CtimeMax",0.06517132534410128f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1629.5995945473665f);
mapReward.put("AhMax",1637.6628299769839f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1637.6429777910835f);
mapReward.put("BhMax",1633.488935923538f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1633.46711785825f);
mapReward.put("ChMax",1636.952582514776f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
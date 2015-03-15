
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper99{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper99(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09264097563453608f);
mapReward.put("AtimeMax",0.04569961662422299f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.033363617289957334f);
mapReward.put("BtimeMax",0.07311785993430375f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.018624452685297787f);
mapReward.put("CtimeMax",0.028264564957458372f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1903.4358508729179f);
mapReward.put("AhMax",1905.5940686343856f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1909.913772742242f);
mapReward.put("BhMax",1909.5918623480995f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1910.1675097568188f);
mapReward.put("ChMax",1906.8606504088384f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper163{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper163(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07336270821976955f);
mapReward.put("AtimeMax",0.009679141472522612f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.034646381066460084f);
mapReward.put("BtimeMax",0.031907271004539786f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09363248258105794f);
mapReward.put("CtimeMax",0.09512222684368864f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1843.610404083208f);
mapReward.put("AhMax",1846.3097031707835f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1844.775904541715f);
mapReward.put("BhMax",1843.5602133012596f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1842.3671965348944f);
mapReward.put("ChMax",1846.0432258357316f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
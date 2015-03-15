
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper495{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper495(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08634327870173075f);
mapReward.put("AtimeMax",0.08197638228444498f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.007243237333060893f);
mapReward.put("BtimeMax",0.049280270809512416f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0277275232456179f);
mapReward.put("CtimeMax",0.035680911619704395f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1509.6848587083548f);
mapReward.put("AhMax",1506.15535199234f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1511.0423907246598f);
mapReward.put("BhMax",1514.0851650152865f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1509.6493111211194f);
mapReward.put("ChMax",1507.6484904583317f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper742{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper742(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.014579687261807871f);
mapReward.put("AtimeMax",0.03584262847280112f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.052725989872157805f);
mapReward.put("BtimeMax",0.03468721691672103f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07164084510523161f);
mapReward.put("CtimeMax",0.09791987859944519f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1263.375197568304f);
mapReward.put("AhMax",1259.4430850140236f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1261.3286673396149f);
mapReward.put("BhMax",1264.4589332872065f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1265.209571631599f);
mapReward.put("ChMax",1261.6913402776217f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1655{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1655(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.058768784158703416f);
mapReward.put("AtimeMax",0.08700502851538225f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.07616528664968779f);
mapReward.put("BtimeMax",0.024404283074331946f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03928116377328711f);
mapReward.put("CtimeMax",0.06606741155465838f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",350.55990102940933f);
mapReward.put("AhMax",353.48414242208185f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",345.221983352677f);
mapReward.put("BhMax",352.9531577081901f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",348.40409523911364f);
mapReward.put("ChMax",352.11841866929825f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
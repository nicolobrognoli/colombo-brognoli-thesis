
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper633{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper633(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.015205595584616838f);
mapReward.put("AtimeMax",0.07729536872096644f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.058935083406862196f);
mapReward.put("BtimeMax",0.0586781910954101f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0872020429918243f);
mapReward.put("CtimeMax",0.056360729733705706f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1369.798046745051f);
mapReward.put("AhMax",1376.6935781474597f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1372.579152621372f);
mapReward.put("BhMax",1371.2678001417175f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1373.2148810224628f);
mapReward.put("ChMax",1371.2738104796524f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
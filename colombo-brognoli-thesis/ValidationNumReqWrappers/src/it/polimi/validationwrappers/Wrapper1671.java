
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1671{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1671(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.020443482381534994f);
mapReward.put("AtimeMax",0.025024275326143895f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.032415490809368085f);
mapReward.put("BtimeMax",0.0023509408850730163f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08877743594871763f);
mapReward.put("CtimeMax",0.08925834377988809f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",338.82782882337216f);
mapReward.put("AhMax",333.94925321824957f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",335.5594302607139f);
mapReward.put("BhMax",333.21710204946174f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",335.56737614611916f);
mapReward.put("ChMax",334.26677121033407f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
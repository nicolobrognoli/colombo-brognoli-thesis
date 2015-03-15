
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper265{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper265(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07782448174925267f);
mapReward.put("AtimeMax",0.059756366217132095f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.062138570235093483f);
mapReward.put("BtimeMax",0.07496113348450262f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0821763572113878f);
mapReward.put("CtimeMax",0.04980579839028397f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1739.4655274279537f);
mapReward.put("AhMax",1741.8804554484825f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1743.1880501864437f);
mapReward.put("BhMax",1735.1496185963183f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1744.779267323296f);
mapReward.put("ChMax",1738.4257472959628f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1663{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1663(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.045000131768746045f);
mapReward.put("AtimeMax",0.07084636384215602f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.015599200271782377f);
mapReward.put("BtimeMax",0.08307913772432873f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.052315678680390706f);
mapReward.put("CtimeMax",0.029788363907280003f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",340.18186901574705f);
mapReward.put("AhMax",346.8922831074525f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",341.3268035099501f);
mapReward.put("BhMax",340.7104722315906f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",341.2609563284954f);
mapReward.put("ChMax",346.8977033800726f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
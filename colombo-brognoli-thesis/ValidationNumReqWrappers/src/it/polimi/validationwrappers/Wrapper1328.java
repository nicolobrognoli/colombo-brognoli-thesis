
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1328{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1328(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02994727225113162f);
mapReward.put("AtimeMax",0.08713233093492144f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.048773751924341094f);
mapReward.put("BtimeMax",0.03370424102247356f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09876019572446271f);
mapReward.put("CtimeMax",0.03406608031519599f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",677.3842301863817f);
mapReward.put("AhMax",673.366880339598f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",674.8901061063732f);
mapReward.put("BhMax",680.5473172476375f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",678.7535548872954f);
mapReward.put("ChMax",679.2846624438106f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
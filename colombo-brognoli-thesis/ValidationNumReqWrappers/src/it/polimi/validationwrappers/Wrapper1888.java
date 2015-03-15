
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1888{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1888(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08003359646436803f);
mapReward.put("AtimeMax",0.0724784520966482f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.001488135623548359f);
mapReward.put("BtimeMax",0.05334193378333317f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.047525581142600505f);
mapReward.put("CtimeMax",0.05024054680253877f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",115.14201692617503f);
mapReward.put("AhMax",121.88884412811714f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",120.93757408132007f);
mapReward.put("BhMax",119.94413488481302f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",114.82705832620418f);
mapReward.put("ChMax",118.49008698828078f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
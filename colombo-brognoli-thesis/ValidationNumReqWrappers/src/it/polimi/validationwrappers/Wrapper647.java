
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper647{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper647(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08478423010711926f);
mapReward.put("AtimeMax",0.09179031617907253f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.034224432054610586f);
mapReward.put("BtimeMax",0.08972330392257537f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08290153388626184f);
mapReward.put("CtimeMax",0.07533367428887275f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1359.0710863830789f);
mapReward.put("AhMax",1357.240903812131f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1353.8095435482624f);
mapReward.put("BhMax",1357.3473071608537f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1353.2432310512622f);
mapReward.put("ChMax",1354.1603674926162f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
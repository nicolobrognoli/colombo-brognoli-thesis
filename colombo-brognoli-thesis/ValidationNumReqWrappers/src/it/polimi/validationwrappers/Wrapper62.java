
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper62{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper62(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0358304934459294f);
mapReward.put("AtimeMax",0.08115156892121543f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.030046584886052264f);
mapReward.put("BtimeMax",0.058346450326478824f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.019742446072029785f);
mapReward.put("CtimeMax",0.09267526145755825f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1938.4940057153276f);
mapReward.put("AhMax",1947.9793442520488f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1942.8143755606884f);
mapReward.put("BhMax",1939.586951914084f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1942.980561538543f);
mapReward.put("ChMax",1938.8698748668755f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
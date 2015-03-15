
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1982{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1982(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06475578907684651f);
mapReward.put("AtimeMax",0.07176502710247756f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.053861806156090465f);
mapReward.put("BtimeMax",0.03265836585835689f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03275293088164921f);
mapReward.put("CtimeMax",0.08514084641015246f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",23.82033610617939f);
mapReward.put("AhMax",19.142057083659456f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",23.245878631193037f);
mapReward.put("BhMax",21.023753715411427f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",19.580387963532843f);
mapReward.put("ChMax",26.514591720254586f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1580{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1580(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02810597397222936f);
mapReward.put("AtimeMax",0.07189452639324745f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.006399760791627939f);
mapReward.put("BtimeMax",0.058448800423610836f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.052716917239124875f);
mapReward.put("CtimeMax",0.05054682309214613f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",426.98485230268614f);
mapReward.put("AhMax",423.4860993850613f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",424.80369403131397f);
mapReward.put("BhMax",423.4962130753459f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",427.53392006681236f);
mapReward.put("ChMax",421.3169191946092f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
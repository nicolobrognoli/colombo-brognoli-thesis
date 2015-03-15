
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1193{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1193(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0033276816242175157f);
mapReward.put("AtimeMax",0.0740438957306804f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.047043075598379204f);
mapReward.put("BtimeMax",0.06014925552079516f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.030481566164735942f);
mapReward.put("CtimeMax",0.09813023810670214f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",811.2543790912431f);
mapReward.put("AhMax",813.9642557002938f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",815.2846763202283f);
mapReward.put("BhMax",814.1679241153139f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",813.8549542200456f);
mapReward.put("ChMax",809.1621552228058f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
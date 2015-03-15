
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper726{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper726(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09471991784625175f);
mapReward.put("AtimeMax",0.08798967634335798f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.042807880267558295f);
mapReward.put("BtimeMax",0.09936016403636398f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.023487877235843425f);
mapReward.put("CtimeMax",0.026276576838395217f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1274.6146630451196f);
mapReward.put("AhMax",1276.484288741458f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1274.546907776255f);
mapReward.put("BhMax",1280.029479563007f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1274.2132151613275f);
mapReward.put("ChMax",1274.1825394740495f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
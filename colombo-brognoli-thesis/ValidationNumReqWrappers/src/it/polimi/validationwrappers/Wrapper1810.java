
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1810{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1810(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06667569635834955f);
mapReward.put("AtimeMax",0.05727218583455994f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.042890641707464996f);
mapReward.put("BtimeMax",0.02211377373716996f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05581976349779436f);
mapReward.put("CtimeMax",0.03951585257698044f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",198.2201574573462f);
mapReward.put("AhMax",194.6284952468913f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",191.8342280802745f);
mapReward.put("BhMax",195.246968058278f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",195.4008353644635f);
mapReward.put("ChMax",198.59314013822188f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
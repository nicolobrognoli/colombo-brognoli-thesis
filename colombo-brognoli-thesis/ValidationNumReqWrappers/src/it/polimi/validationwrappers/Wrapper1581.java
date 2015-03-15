
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1581{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1581(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.023942864448757716f);
mapReward.put("AtimeMax",0.07004777360556119f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.029879511452598973f);
mapReward.put("BtimeMax",0.08303309429194491f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04887994130071867f);
mapReward.put("CtimeMax",0.0470707979944309f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",423.9066567599239f);
mapReward.put("AhMax",421.0733229885969f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",419.51614041501676f);
mapReward.put("BhMax",428.5765083561361f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",428.1343857404043f);
mapReward.put("ChMax",419.27880806150915f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
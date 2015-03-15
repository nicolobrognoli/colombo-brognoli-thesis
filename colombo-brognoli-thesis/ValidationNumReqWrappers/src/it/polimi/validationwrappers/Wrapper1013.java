
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1013{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1013(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.053351064963617245f);
mapReward.put("AtimeMax",0.05835016978949399f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.026839927055012723f);
mapReward.put("BtimeMax",0.09769726432720191f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0212403312563191f);
mapReward.put("CtimeMax",0.09125760882725811f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",995.4123471406779f);
mapReward.put("AhMax",996.7535519445223f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",991.8170596415935f);
mapReward.put("BhMax",996.1729100590055f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",987.82886011767f);
mapReward.put("ChMax",993.8390875661813f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
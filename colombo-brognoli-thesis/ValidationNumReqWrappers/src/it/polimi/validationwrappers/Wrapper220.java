
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper220{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper220(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.022664961569149544f);
mapReward.put("AtimeMax",0.019589270403570003f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.09998490769034499f);
mapReward.put("BtimeMax",0.06334678650355699f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.091614834630116f);
mapReward.put("CtimeMax",0.08021766408274214f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1785.7817153347607f);
mapReward.put("AhMax",1781.9138388669887f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1784.5671600568396f);
mapReward.put("BhMax",1789.5211732189305f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1786.767599139355f);
mapReward.put("ChMax",1784.4100528236172f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
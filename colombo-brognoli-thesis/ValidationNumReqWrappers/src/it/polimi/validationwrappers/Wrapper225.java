
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper225{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper225(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05065362912227835f);
mapReward.put("AtimeMax",0.08465975725789293f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",3.9131713919625665E-4f);
mapReward.put("BtimeMax",0.06612221782296891f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.057931060443878614f);
mapReward.put("CtimeMax",0.0839769269350242f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1777.9034458927285f);
mapReward.put("AhMax",1782.2902995590064f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1781.8923378377483f);
mapReward.put("BhMax",1783.2245017103232f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1783.1771977373103f);
mapReward.put("ChMax",1783.6923261479408f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
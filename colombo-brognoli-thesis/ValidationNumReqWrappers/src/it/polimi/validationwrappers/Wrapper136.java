
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper136{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper136(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08522790881118376f);
mapReward.put("AtimeMax",0.08241840821177229f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.009922335220959377f);
mapReward.put("BtimeMax",0.0028437595943194395f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0034244999124855347f);
mapReward.put("CtimeMax",0.08008110156876855f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1871.977547013482f);
mapReward.put("AhMax",1864.8493672656598f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1869.4122942507295f);
mapReward.put("BhMax",1869.927345753426f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1867.9663061663146f);
mapReward.put("ChMax",1872.8803497812166f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
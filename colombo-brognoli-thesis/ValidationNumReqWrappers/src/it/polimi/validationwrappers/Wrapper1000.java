
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1000{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1000(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02777844084130393f);
mapReward.put("AtimeMax",0.07475423216338724f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.003847705258802514f);
mapReward.put("BtimeMax",0.0332007118770279f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",6.443216642278649E-4f);
mapReward.put("CtimeMax",0.05969291918895381f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1006.639361791878f);
mapReward.put("AhMax",1003.9489542651596f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1008.6204649155898f);
mapReward.put("BhMax",1001.8144020900352f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1001.7654994879557f);
mapReward.put("ChMax",1009.3405020715171f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
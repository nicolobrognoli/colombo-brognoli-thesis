
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1325{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1325(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.015702839124139122f);
mapReward.put("AtimeMax",0.051353312342353095f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.014116648758873241f);
mapReward.put("BtimeMax",0.043885990994168844f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09438578787520972f);
mapReward.put("CtimeMax",0.0196778091674508f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",682.3949451975358f);
mapReward.put("AhMax",676.0266557243245f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",682.419354572581f);
mapReward.put("BhMax",676.0427761735292f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",679.0234911874693f);
mapReward.put("ChMax",679.279433374348f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
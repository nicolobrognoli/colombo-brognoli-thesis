
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1409{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1409(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.046466841081594115f);
mapReward.put("AtimeMax",0.0720901492518568f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.014686135432337521f);
mapReward.put("BtimeMax",0.04008005299953572f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03940717491094057f);
mapReward.put("CtimeMax",0.07274256053299458f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",595.8218538979166f);
mapReward.put("AhMax",591.8804522158629f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",598.4949304251332f);
mapReward.put("BhMax",599.348974925396f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",595.5820223617281f);
mapReward.put("ChMax",599.6051613572452f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
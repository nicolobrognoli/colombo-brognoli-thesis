
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1984{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1984(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.048238445113385486f);
mapReward.put("AtimeMax",0.03540584442685322f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.022038135489391486f);
mapReward.put("BtimeMax",0.08639299351584064f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08979811351375952f);
mapReward.put("CtimeMax",0.09780024677866082f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",25.08832052483035f);
mapReward.put("AhMax",21.785661741347027f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",18.84678117376761f);
mapReward.put("BhMax",24.185486595450627f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",16.193737531318884f);
mapReward.put("ChMax",23.04481307424106f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
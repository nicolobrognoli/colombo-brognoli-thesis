
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1647{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1647(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.016236625811582382f);
mapReward.put("AtimeMax",0.028731717757272447f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.027796386508769165f);
mapReward.put("BtimeMax",0.08742399726158642f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04669938926432948f);
mapReward.put("CtimeMax",0.017920679528866446f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",355.56303860080754f);
mapReward.put("AhMax",360.38004177004933f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",360.5697894139511f);
mapReward.put("BhMax",355.2762422246444f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",356.52390257998997f);
mapReward.put("ChMax",359.36300652369994f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
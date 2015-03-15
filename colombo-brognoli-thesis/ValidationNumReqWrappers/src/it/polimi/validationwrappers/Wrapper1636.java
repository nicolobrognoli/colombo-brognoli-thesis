
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1636{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1636(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.013747063712882267f);
mapReward.put("AtimeMax",6.976983953996929E-4f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.027778234370704778f);
mapReward.put("BtimeMax",0.08667711338896106f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07924646934959359f);
mapReward.put("CtimeMax",0.014710052089183922f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",365.5005945953393f);
mapReward.put("AhMax",367.692500820735f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",372.2792481976938f);
mapReward.put("BhMax",372.11451067528833f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",368.19200857466046f);
mapReward.put("ChMax",373.05619958751987f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
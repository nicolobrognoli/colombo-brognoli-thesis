
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1290{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1290(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05203349125082646f);
mapReward.put("AtimeMax",0.08535882705208475f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.0816689654869613f);
mapReward.put("BtimeMax",0.06626452336184442f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.013095668152989615f);
mapReward.put("CtimeMax",0.07508996562368818f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",713.4919628872253f);
mapReward.put("AhMax",717.3808616750285f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",712.8735210890532f);
mapReward.put("BhMax",718.5514838772557f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",716.3555929157887f);
mapReward.put("ChMax",712.34536260319f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
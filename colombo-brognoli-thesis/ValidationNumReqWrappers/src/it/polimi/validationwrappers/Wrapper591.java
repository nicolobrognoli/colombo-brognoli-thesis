
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper591{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper591(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06012770550239762f);
mapReward.put("AtimeMax",0.09938696755348182f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",5.683191743510729E-6f);
mapReward.put("BtimeMax",0.08596093938215951f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08606420631486734f);
mapReward.put("CtimeMax",0.01016345635794499f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1418.0947847542334f);
mapReward.put("AhMax",1415.1457425888095f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1415.9012986914634f);
mapReward.put("BhMax",1418.3556515578234f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1417.6344504306016f);
mapReward.put("ChMax",1416.1067908581672f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
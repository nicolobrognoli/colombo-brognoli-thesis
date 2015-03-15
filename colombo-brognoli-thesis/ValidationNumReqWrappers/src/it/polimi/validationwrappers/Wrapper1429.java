
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1429{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1429(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03266431196146374f);
mapReward.put("AtimeMax",0.0344649129822457f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.094078705056485f);
mapReward.put("BtimeMax",0.05391473289210219f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.025122953906223478f);
mapReward.put("CtimeMax",0.08243042756185046f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",580.0343707938241f);
mapReward.put("AhMax",579.4536905941093f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",574.9959542483983f);
mapReward.put("BhMax",571.1286484350385f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",571.5501352713985f);
mapReward.put("ChMax",573.1611430894328f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
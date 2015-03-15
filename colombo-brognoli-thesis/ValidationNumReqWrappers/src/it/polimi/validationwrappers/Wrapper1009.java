
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1009{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1009(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.062038819544838995f);
mapReward.put("AtimeMax",0.03503797578648721f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.029873703603704737f);
mapReward.put("BtimeMax",0.06885780122187693f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09200983877311725f);
mapReward.put("CtimeMax",0.09792707327944969f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",993.7248814461707f);
mapReward.put("AhMax",997.8259198276576f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",998.2086420243975f);
mapReward.put("BhMax",995.0226812903013f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",991.2091875558934f);
mapReward.put("ChMax",993.8853325105662f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1153{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1153(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.038290734598729115f);
mapReward.put("AtimeMax",0.07394058588180892f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.02158635745833588f);
mapReward.put("BtimeMax",0.001377951253748333f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.01947378391740371f);
mapReward.put("CtimeMax",0.05622529619494725f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",850.3661152373762f);
mapReward.put("AhMax",851.9584015792796f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",853.9901975533439f);
mapReward.put("BhMax",850.9058053643548f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",856.1209467668824f);
mapReward.put("ChMax",847.9556905474891f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
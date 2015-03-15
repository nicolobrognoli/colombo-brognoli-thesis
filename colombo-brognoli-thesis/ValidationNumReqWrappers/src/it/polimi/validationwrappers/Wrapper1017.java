
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1017{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1017(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06413757126521448f);
mapReward.put("AtimeMax",0.006556190406544071f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.017788267961834792f);
mapReward.put("BtimeMax",0.003292594062312848f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.016705622786199727f);
mapReward.put("CtimeMax",0.08050276408095389f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",987.6314123092313f);
mapReward.put("AhMax",988.4733374609417f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",989.7592231124598f);
mapReward.put("BhMax",986.1311277311383f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",984.553618853852f);
mapReward.put("ChMax",985.5026615782491f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
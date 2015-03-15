
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1425{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1425(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.008117576947771887f);
mapReward.put("AtimeMax",0.02153211340018486f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.051974616830232426f);
mapReward.put("BtimeMax",0.04147637183044832f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09274522352113582f);
mapReward.put("CtimeMax",0.09529396273144002f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",577.8974535353162f);
mapReward.put("AhMax",576.1971773082358f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",584.4138402746885f);
mapReward.put("BhMax",578.2637381912396f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",576.0880931607584f);
mapReward.put("ChMax",576.8309610245818f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
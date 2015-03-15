
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper962{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper962(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05153920095463528f);
mapReward.put("AtimeMax",0.031243393121585604f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.003457426541118691f);
mapReward.put("BtimeMax",0.08448651222266249f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08048077439335902f);
mapReward.put("CtimeMax",0.06513259627850629f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1045.4861454988315f);
mapReward.put("AhMax",1042.265582372762f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1043.2725165218649f);
mapReward.put("BhMax",1038.3465679211397f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1046.4880513343537f);
mapReward.put("ChMax",1045.8900923371427f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
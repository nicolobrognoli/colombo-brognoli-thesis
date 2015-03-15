
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1847{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1847(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09890194030144203f);
mapReward.put("AtimeMax",0.0384043401227253f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.027499731809050132f);
mapReward.put("BtimeMax",0.061385583276153545f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07414987286814377f);
mapReward.put("CtimeMax",0.01021210951525725f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",155.93813564065317f);
mapReward.put("AhMax",159.85619903406695f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",154.47543110377012f);
mapReward.put("BhMax",161.5991214504061f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",162.05574450761478f);
mapReward.put("ChMax",162.3787622809668f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
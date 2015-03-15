
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper793{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper793(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06850057592705325f);
mapReward.put("AtimeMax",0.052555909614736586f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.061516039982900714f);
mapReward.put("BtimeMax",0.023397060283305827f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09189899019204753f);
mapReward.put("CtimeMax",0.01955727021612593f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1215.5648074062765f);
mapReward.put("AhMax",1208.3504421959167f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1211.0797590342545f);
mapReward.put("BhMax",1207.2650214974121f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1208.7984390303338f);
mapReward.put("ChMax",1215.479429527955f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
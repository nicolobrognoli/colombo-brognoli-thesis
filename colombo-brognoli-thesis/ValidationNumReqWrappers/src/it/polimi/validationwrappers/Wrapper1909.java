
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1909{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1909(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09945630313791297f);
mapReward.put("AtimeMax",0.051992822239992666f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.060246243511054606f);
mapReward.put("BtimeMax",0.06666734979104047f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05644328725306076f);
mapReward.put("CtimeMax",0.05665486146741463f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",95.7027463552829f);
mapReward.put("AhMax",99.18856465318888f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",94.67838638353514f);
mapReward.put("BhMax",93.11706843153469f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",98.0796848220993f);
mapReward.put("ChMax",99.88747887854792f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
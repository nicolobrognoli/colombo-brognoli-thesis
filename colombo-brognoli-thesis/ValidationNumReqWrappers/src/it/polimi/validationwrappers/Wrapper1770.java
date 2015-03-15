
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1770{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1770(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07185590540890067f);
mapReward.put("AtimeMax",0.0035763210690418655f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.035827677329577576f);
mapReward.put("BtimeMax",0.09240124455674571f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05324609781306796f);
mapReward.put("CtimeMax",0.09226741076095406f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",230.55765610621057f);
mapReward.put("AhMax",239.08338133632415f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",235.05769938030753f);
mapReward.put("BhMax",233.00642737083916f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",235.60945405644736f);
mapReward.put("ChMax",234.5284204990669f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
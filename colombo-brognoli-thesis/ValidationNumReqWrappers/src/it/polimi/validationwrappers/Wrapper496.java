
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper496{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper496(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.022470771451101323f);
mapReward.put("AtimeMax",0.05904537814344355f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.036112477499573935f);
mapReward.put("BtimeMax",0.012288058534585634f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0650861120872025f);
mapReward.put("CtimeMax",0.00586419856868956f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1509.515001022333f);
mapReward.put("AhMax",1512.9742700549637f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1510.6188677979053f);
mapReward.put("BhMax",1504.3442565090406f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1513.9211545330634f);
mapReward.put("ChMax",1507.6112590316031f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
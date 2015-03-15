
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper954{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper954(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09769828796955901f);
mapReward.put("AtimeMax",0.08223133218502174f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.039697532230860234f);
mapReward.put("BtimeMax",0.03773191048431548f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09407066562455875f);
mapReward.put("CtimeMax",1.9211497279978396E-4f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1053.3353083804573f);
mapReward.put("AhMax",1046.4511477604783f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1049.0162526048719f);
mapReward.put("BhMax",1053.1008501261647f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1048.7655340620965f);
mapReward.put("ChMax",1050.2243496761878f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
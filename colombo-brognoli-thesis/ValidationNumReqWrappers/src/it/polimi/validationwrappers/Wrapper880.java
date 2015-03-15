
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper880{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper880(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0833737240082638f);
mapReward.put("AtimeMax",0.05421670026097528f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.025915617760129905f);
mapReward.put("BtimeMax",0.02014906407096756f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05399105784197796f);
mapReward.put("CtimeMax",0.02837217303593812f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1129.74006067095f);
mapReward.put("AhMax",1128.576956527528f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1125.2921934869962f);
mapReward.put("BhMax",1128.652424018244f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1121.0481938320854f);
mapReward.put("ChMax",1126.918968388014f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
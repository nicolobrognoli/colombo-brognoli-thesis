
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1182{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1182(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07654744929936455f);
mapReward.put("AtimeMax",0.07677450886646006f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.026606030206992603f);
mapReward.put("BtimeMax",0.09050327645116664f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",8.503087089713924E-4f);
mapReward.put("CtimeMax",0.07725262294053184f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",819.6468327285625f);
mapReward.put("AhMax",827.634701143353f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",818.3766367674402f);
mapReward.put("BhMax",818.9713046420129f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",821.5813019783678f);
mapReward.put("ChMax",825.9267924857845f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
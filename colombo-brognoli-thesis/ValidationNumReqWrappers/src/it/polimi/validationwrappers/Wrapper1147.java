
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1147{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1147(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.01699980650880123f);
mapReward.put("AtimeMax",0.03996094318104489f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.053942245431691696f);
mapReward.put("BtimeMax",0.0035635409552938315f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04243859183840996f);
mapReward.put("CtimeMax",0.09697837807309377f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",862.5739733205791f);
mapReward.put("AhMax",858.0807969728903f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",854.1021861728788f);
mapReward.put("BhMax",861.8545954838236f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",857.0937600435367f);
mapReward.put("ChMax",856.749111602042f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1081{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1081(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05126859276768535f);
mapReward.put("AtimeMax",0.09819050278499643f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.006019349247003647f);
mapReward.put("BtimeMax",0.07038945143423117f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05276039291934538f);
mapReward.put("CtimeMax",0.07835363868400197f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",928.7690484162653f);
mapReward.put("AhMax",925.6125356010539f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",919.4174981730132f);
mapReward.put("BhMax",927.9166678037448f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",925.9121585967513f);
mapReward.put("ChMax",926.038705524555f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
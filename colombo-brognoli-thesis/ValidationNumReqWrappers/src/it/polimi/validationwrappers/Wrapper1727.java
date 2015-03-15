
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1727{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1727(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03369571533703723f);
mapReward.put("AtimeMax",0.0580383448166424f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.057620031846044986f);
mapReward.put("BtimeMax",0.08562525275062702f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.028640136695002538f);
mapReward.put("CtimeMax",0.04814046239522328f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",279.8591510504262f);
mapReward.put("AhMax",279.59223950417146f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",274.157927274191f);
mapReward.put("BhMax",278.3948733999985f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",276.25112127560897f);
mapReward.put("ChMax",274.4475111910508f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
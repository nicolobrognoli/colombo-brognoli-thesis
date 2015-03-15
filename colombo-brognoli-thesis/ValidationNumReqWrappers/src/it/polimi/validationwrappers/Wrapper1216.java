
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1216{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1216(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0997376065965551f);
mapReward.put("AtimeMax",0.027283644837160947f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.00288904915803031f);
mapReward.put("BtimeMax",8.163068675489105E-4f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0797564102240902f);
mapReward.put("CtimeMax",0.05422458252425172f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",790.2711670757822f);
mapReward.put("AhMax",791.1058900091357f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",790.7747209057006f);
mapReward.put("BhMax",789.7767735590749f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",784.5483674607955f);
mapReward.put("ChMax",792.8089678919915f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
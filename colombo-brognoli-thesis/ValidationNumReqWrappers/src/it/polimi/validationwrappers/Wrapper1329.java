
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1329{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1329(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.044036433968429475f);
mapReward.put("AtimeMax",0.061702814385702284f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.056487181363665796f);
mapReward.put("BtimeMax",0.0423872500502403f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0025840849820905286f);
mapReward.put("CtimeMax",0.0815796777641044f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",671.9426631843547f);
mapReward.put("AhMax",676.9491534403413f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",679.4065341320882f);
mapReward.put("BhMax",672.0170152025706f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",671.2946607929322f);
mapReward.put("ChMax",676.6628063176979f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
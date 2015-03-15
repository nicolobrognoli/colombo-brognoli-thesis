
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1323{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1323(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.012491466481911096f);
mapReward.put("AtimeMax",0.07608710046732235f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.045932943369669924f);
mapReward.put("BtimeMax",0.02510341171408287f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.024424156597302238f);
mapReward.put("CtimeMax",0.06688639028517065f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",683.7313553351253f);
mapReward.put("AhMax",677.817953678772f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",680.5561341099732f);
mapReward.put("BhMax",677.1823141138608f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",677.7438031367445f);
mapReward.put("ChMax",678.0453457444105f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
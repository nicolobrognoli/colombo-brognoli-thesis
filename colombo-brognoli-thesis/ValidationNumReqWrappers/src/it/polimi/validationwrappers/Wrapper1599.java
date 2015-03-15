
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1599{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1599(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09036613429891409f);
mapReward.put("AtimeMax",0.06012809910290127f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.022125990258773875f);
mapReward.put("BtimeMax",0.09978394701647669f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06330475256406524f);
mapReward.put("CtimeMax",0.07934599826715522f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",410.5577621982435f);
mapReward.put("AhMax",407.3884203700974f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",401.94496583161043f);
mapReward.put("BhMax",410.6083282755286f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",402.5954158136995f);
mapReward.put("ChMax",403.45644690923535f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
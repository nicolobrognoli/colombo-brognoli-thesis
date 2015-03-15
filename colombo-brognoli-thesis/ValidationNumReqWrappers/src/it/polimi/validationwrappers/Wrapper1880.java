
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1880{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1880(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09625281139980886f);
mapReward.put("AtimeMax",0.0937254328014397f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.028503533965347817f);
mapReward.put("BtimeMax",0.003220514336977842f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06216681486039325f);
mapReward.put("CtimeMax",0.07790862651218619f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",126.21246580197433f);
mapReward.put("AhMax",123.64437370940232f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",126.46440251621492f);
mapReward.put("BhMax",129.73123701027103f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",129.04536339901344f);
mapReward.put("ChMax",128.69105374164357f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
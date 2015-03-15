
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1697{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1697(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.055152145968740775f);
mapReward.put("AtimeMax",0.029431059188772944f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.056077242349071944f);
mapReward.put("BtimeMax",0.021915449745345872f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06190963073569457f);
mapReward.put("CtimeMax",0.008022944619337436f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",311.8156369458105f);
mapReward.put("AhMax",309.75170932535997f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",308.1005353578326f);
mapReward.put("BhMax",310.26512909458586f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",312.25324106010436f);
mapReward.put("ChMax",305.9727216028622f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
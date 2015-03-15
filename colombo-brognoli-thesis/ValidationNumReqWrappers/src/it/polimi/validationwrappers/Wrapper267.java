
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper267{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper267(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02125788597416145f);
mapReward.put("AtimeMax",0.024358117522622257f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.059746028358702394f);
mapReward.put("BtimeMax",0.02125107829028978f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05250252672880833f);
mapReward.put("CtimeMax",0.06167755227218247f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1733.9503717192981f);
mapReward.put("AhMax",1734.869174834338f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1735.1459033766998f);
mapReward.put("BhMax",1738.7272647759394f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1734.5483605441427f);
mapReward.put("ChMax",1735.8944080441665f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1192{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1192(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.022904843586526058f);
mapReward.put("AtimeMax",0.05396948148103842f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.001272587160392602f);
mapReward.put("BtimeMax",0.07689148680994798f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04557582678514934f);
mapReward.put("CtimeMax",0.029894772509594512f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",815.7624005462775f);
mapReward.put("AhMax",812.2079449035504f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",812.9604236741702f);
mapReward.put("BhMax",811.9218107447297f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",808.7817240792048f);
mapReward.put("ChMax",813.8419542747197f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
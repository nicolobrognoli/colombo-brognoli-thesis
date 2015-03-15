
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1597{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1597(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08628446855785714f);
mapReward.put("AtimeMax",0.023166659042790118f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.061196574293293615f);
mapReward.put("BtimeMax",0.03017706567895606f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.007125656425391158f);
mapReward.put("CtimeMax",0.008335942982853695f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",403.98729931103f);
mapReward.put("AhMax",410.13862577324824f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",411.049966641813f);
mapReward.put("BhMax",408.1980960096947f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",405.65918195346126f);
mapReward.put("ChMax",409.3190361002992f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
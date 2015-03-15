
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1054{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1054(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.013538179859475485f);
mapReward.put("AtimeMax",0.0313938863081525f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.054703566332588285f);
mapReward.put("BtimeMax",0.03878527035160412f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03180017536424682f);
mapReward.put("CtimeMax",0.05364813248745297f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",954.6722462280558f);
mapReward.put("AhMax",950.9756300601301f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",946.4210595344424f);
mapReward.put("BhMax",953.7227398872083f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",954.3265853836693f);
mapReward.put("ChMax",954.0469833831222f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
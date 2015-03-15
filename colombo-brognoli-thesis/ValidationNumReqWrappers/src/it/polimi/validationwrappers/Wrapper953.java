
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper953{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper953(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04462257322737582f);
mapReward.put("AtimeMax",0.06396427215134466f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.023633956970584437f);
mapReward.put("BtimeMax",0.04063397986779264f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04216136748706458f);
mapReward.put("CtimeMax",0.035519674540956225f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1052.8679784628819f);
mapReward.put("AhMax",1055.06793104655f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1051.5161210705567f);
mapReward.put("BhMax",1056.0156148797496f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1048.4267139312071f);
mapReward.put("ChMax",1051.2582987411718f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
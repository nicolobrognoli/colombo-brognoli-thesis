
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper917{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper917(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.05046858807283011f);
mapReward.put("AtimeMax",0.09684810518928735f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.018527792076948425f);
mapReward.put("BtimeMax",0.09302691273837486f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07992998972470675f);
mapReward.put("CtimeMax",0.0992599417234075f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1091.367540210264f);
mapReward.put("AhMax",1086.6322517081478f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1090.4828636677262f);
mapReward.put("BhMax",1092.7463577964045f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1090.6433828175955f);
mapReward.put("ChMax",1087.188500760769f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
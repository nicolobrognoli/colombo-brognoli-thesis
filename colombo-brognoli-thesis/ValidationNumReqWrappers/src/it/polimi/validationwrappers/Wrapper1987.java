
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1987{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1987(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06661262948426204f);
mapReward.put("AtimeMax",0.036966954406094085f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.06505607427084083f);
mapReward.put("BtimeMax",0.01948456798643482f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",3.2416430718572585E-4f);
mapReward.put("CtimeMax",0.09983600286915909f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",19.629697507060495f);
mapReward.put("AhMax",15.621250302596891f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",15.025805997017951f);
mapReward.put("BhMax",18.218414539169707f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",21.281842958399903f);
mapReward.put("ChMax",14.122209188007465f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
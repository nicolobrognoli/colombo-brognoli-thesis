
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper75{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper75(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.013953494491358808f);
mapReward.put("AtimeMax",0.06957952940384377f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.013331923361493104f);
mapReward.put("BtimeMax",0.09477856158758843f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06782364813030739f);
mapReward.put("CtimeMax",0.09857533257992232f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1927.9305295682318f);
mapReward.put("AhMax",1927.612079226877f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1929.661211680891f);
mapReward.put("BhMax",1933.0492924904404f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1927.6012314094035f);
mapReward.put("ChMax",1926.3981061524212f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
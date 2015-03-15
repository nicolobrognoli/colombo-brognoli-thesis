
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1133{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1133(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.06735698732320089f);
mapReward.put("AtimeMax",0.09000542417614242f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.03471145384039802f);
mapReward.put("BtimeMax",0.024063687404750365f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",7.584803639036908E-5f);
mapReward.put("CtimeMax",0.020435606456107546f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",870.5361230520251f);
mapReward.put("AhMax",875.5998447885954f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",873.1957685485979f);
mapReward.put("BhMax",872.9473384280377f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",875.543992346254f);
mapReward.put("ChMax",871.1520415407775f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
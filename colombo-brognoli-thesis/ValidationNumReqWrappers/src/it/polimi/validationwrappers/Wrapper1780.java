
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1780{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1780(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.028913204235634128f);
mapReward.put("AtimeMax",0.05963258613416293f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.01906067034379668f);
mapReward.put("BtimeMax",0.09103089824144403f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07921235699858781f);
mapReward.put("CtimeMax",0.07706332744368748f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",223.08437552780313f);
mapReward.put("AhMax",226.73136988394333f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",226.24167352996295f);
mapReward.put("BhMax",226.24184898227315f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",225.93400697291554f);
mapReward.put("ChMax",229.225480435873f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
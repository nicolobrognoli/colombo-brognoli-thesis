
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1504{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1504(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.02241897385150523f);
mapReward.put("AtimeMax",0.006720089520460481f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.028864218853053812f);
mapReward.put("BtimeMax",0.0503797206422287f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.05179874609867522f);
mapReward.put("CtimeMax",0.025916342059839236f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",505.3052067361041f);
mapReward.put("AhMax",504.44767140832477f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",501.7381482167038f);
mapReward.put("BhMax",502.6807559955043f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",497.7254499702169f);
mapReward.put("ChMax",501.6816908231585f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
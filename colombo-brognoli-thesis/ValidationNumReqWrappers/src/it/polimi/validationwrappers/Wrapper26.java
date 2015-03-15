
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper26{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper26(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0018056242166470838f);
mapReward.put("AtimeMax",0.051365428266735014f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.005175471256836673f);
mapReward.put("BtimeMax",0.020546026154786946f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03482044733341694f);
mapReward.put("CtimeMax",0.023708087990170944f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1974.116689740558f);
mapReward.put("AhMax",1976.12335863277f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1974.7364004233964f);
mapReward.put("BhMax",1982.3333898565984f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1979.8434149369466f);
mapReward.put("ChMax",1978.6637467887006f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
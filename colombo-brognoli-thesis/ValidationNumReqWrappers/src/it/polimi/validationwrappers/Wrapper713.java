
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper713{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper713(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09665417883925218f);
mapReward.put("AtimeMax",0.022070257894137735f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.047437327580559074f);
mapReward.put("BtimeMax",0.037080544016180404f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.008304466674250787f);
mapReward.put("CtimeMax",0.08962346390452998f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1292.5817290174707f);
mapReward.put("AhMax",1291.7607760825547f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1292.4691672621182f);
mapReward.put("BhMax",1294.8516944909152f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1296.249074710568f);
mapReward.put("ChMax",1289.1114693031957f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
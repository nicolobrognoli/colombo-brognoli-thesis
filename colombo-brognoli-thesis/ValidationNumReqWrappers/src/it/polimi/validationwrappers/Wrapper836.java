
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper836{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper836(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03270803711768751f);
mapReward.put("AtimeMax",0.09453233360512596f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.061826866045771436f);
mapReward.put("BtimeMax",0.07818016861680038f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0430648546539902f);
mapReward.put("CtimeMax",0.08239479027845831f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1168.8343537604649f);
mapReward.put("AhMax",1172.804069905458f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1168.9823733304486f);
mapReward.put("BhMax",1166.7273719447899f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1172.3939650145737f);
mapReward.put("ChMax",1170.7849624932758f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
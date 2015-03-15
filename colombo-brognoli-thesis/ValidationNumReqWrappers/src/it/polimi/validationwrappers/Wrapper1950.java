
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1950{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1950(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.03633880234471158f);
mapReward.put("AtimeMax",0.07167400365677569f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",9.016995424769303E-4f);
mapReward.put("BtimeMax",0.02522181697874968f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.0910235111737511f);
mapReward.put("CtimeMax",0.015713551270056646f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",52.93952987704196f);
mapReward.put("AhMax",53.67552575334771f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",52.55122340988264f);
mapReward.put("BhMax",55.74372630970674f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",56.25022966558471f);
mapReward.put("ChMax",51.66838161471295f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
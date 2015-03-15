
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper401{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper401(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0952578616515149f);
mapReward.put("AtimeMax",0.03070924273289579f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.051594762965220586f);
mapReward.put("BtimeMax",0.0836040012946309f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03816638250386576f);
mapReward.put("CtimeMax",0.08217936142112926f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1602.4999757661126f);
mapReward.put("AhMax",1606.9679924549273f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1608.7393247804298f);
mapReward.put("BhMax",1603.9228153689705f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1607.934415519431f);
mapReward.put("ChMax",1602.3094071632654f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
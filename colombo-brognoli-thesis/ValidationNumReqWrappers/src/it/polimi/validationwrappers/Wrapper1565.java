
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1565{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1565(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08702238638755382f);
mapReward.put("AtimeMax",0.06749576754027872f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.07779720506131384f);
mapReward.put("BtimeMax",0.014625607044401046f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",4.614092941682468E-4f);
mapReward.put("CtimeMax",0.045711864279877126f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",436.1505711904903f);
mapReward.put("AhMax",442.9820269271451f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",444.388711431986f);
mapReward.put("BhMax",440.7683742445178f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",441.25193234198423f);
mapReward.put("ChMax",436.3308498890067f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
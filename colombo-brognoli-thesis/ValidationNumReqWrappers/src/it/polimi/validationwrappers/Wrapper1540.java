
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1540{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1540(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0583044091338462f);
mapReward.put("AtimeMax",0.05797777105020776f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.038415963570368715f);
mapReward.put("BtimeMax",0.027491287543325037f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.07510201789243126f);
mapReward.put("CtimeMax",0.08041796776013681f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",465.3748138179149f);
mapReward.put("AhMax",463.39295807848936f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",464.7577397746223f);
mapReward.put("BhMax",468.07998274625487f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",465.6837289389777f);
mapReward.put("ChMax",465.5867982789617f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1346{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1346(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07374699701302734f);
mapReward.put("AtimeMax",0.021837727286219032f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.012433046303643924f);
mapReward.put("BtimeMax",0.0808081018609296f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09071520738889757f);
mapReward.put("CtimeMax",0.012805485442589203f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",656.5019577278802f);
mapReward.put("AhMax",663.5103994079592f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",656.7678511542587f);
mapReward.put("BhMax",662.9222644094123f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",658.5775689909552f);
mapReward.put("ChMax",662.3952660869093f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
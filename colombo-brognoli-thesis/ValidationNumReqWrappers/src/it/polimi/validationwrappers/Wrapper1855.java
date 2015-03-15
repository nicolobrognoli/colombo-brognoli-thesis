
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1855{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1855(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.0629634157328188f);
mapReward.put("AtimeMax",0.09041706429570931f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.035970933783519655f);
mapReward.put("BtimeMax",0.04437786034847332f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.036964394378267186f);
mapReward.put("CtimeMax",0.09165918506841435f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",151.61292548392862f);
mapReward.put("AhMax",153.34111493200933f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",147.38330497469204f);
mapReward.put("BhMax",145.20765180576674f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",153.2555563278371f);
mapReward.put("ChMax",145.74088468822796f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper172{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper172(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07643209428938007f);
mapReward.put("AtimeMax",0.07039227293630836f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.01370191053253259f);
mapReward.put("BtimeMax",0.019435552837488334f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09328174177595219f);
mapReward.put("CtimeMax",0.019218085316214974f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1835.504226634435f);
mapReward.put("AhMax",1834.4170726574916f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1832.114924645207f);
mapReward.put("BhMax",1837.4356296122057f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1837.6453394706198f);
mapReward.put("ChMax",1829.7872487972452f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
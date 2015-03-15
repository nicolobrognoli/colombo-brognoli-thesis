
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1023{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1023(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.041411605234244676f);
mapReward.put("AtimeMax",0.0017102250542987084f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.049037364144018304f);
mapReward.put("BtimeMax",0.01687136859197542f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.09702296531548729f);
mapReward.put("CtimeMax",0.0919235660097926f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",986.7982351784218f);
mapReward.put("AhMax",983.7138412352579f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",978.5729426554907f);
mapReward.put("BhMax",982.1699759093987f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",978.7431475936042f);
mapReward.put("ChMax",983.4747681088223f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
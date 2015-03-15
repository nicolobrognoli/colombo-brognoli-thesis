
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper74{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper74(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.07444190556453337f);
mapReward.put("AtimeMax",0.061649503117867745f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.0018445318497908314f);
mapReward.put("BtimeMax",0.05171402860259801f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.03801842469916378f);
mapReward.put("CtimeMax",0.09385693541736038f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1930.549622899439f);
mapReward.put("AhMax",1935.730896698315f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1935.1834958207173f);
mapReward.put("BhMax",1929.3429782124888f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1930.338895667836f);
mapReward.put("ChMax",1927.1581997056023f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
package it.polimi.numreq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper implements ActivityInterface{
	private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper(){
rewardNameList.add("time");mapReward.put("totaltime", 22.0f);mapReward.put("policytime", 0.0f);mapReward.put("weighttime", 0.0f);mapReward.put("Atime", 6.0f);mapReward.put("AtimeMin", 6.0f);mapReward.put("AtimeMax", 6.0f);mapReward.put("Btime", 6.0f);mapReward.put("BtimeMin", 6.0f);mapReward.put("BtimeMax", 6.0f);mapReward.put("Ctime", 6.0f);mapReward.put("CtimeMin", 6.0f);mapReward.put("CtimeMax", 6.0f);alternatives.add("A");alternatives.add("B");alternatives.add("C");rewardNameList.add("h");mapReward.put("totalh", 22.0f);mapReward.put("policyh", 0.0f);mapReward.put("weighth", 0.0f);
mapReward.put("Ah",6.0f);
mapReward.put("AhMin",6.0f);
mapReward.put("AhMax",6.0f);
mapReward.put("Bh",6.0f);
mapReward.put("BhMin",6.0f);
mapReward.put("BhMax",6.0f);
mapReward.put("Ch",6.0f);
mapReward.put("ChMin",6.0f);
mapReward.put("ChMax",6.0f);rewardNameList.add("i");mapReward.put("totali", 22.0f);mapReward.put("policyi", 0.0f);mapReward.put("weighti", 0.0f);
mapReward.put("Ai",6.0f);
mapReward.put("AiMin",6.0f);
mapReward.put("AiMax",6.0f);
mapReward.put("Bi",6.0f);
mapReward.put("BiMin",6.0f);
mapReward.put("BiMax",6.0f);
mapReward.put("Ci",6.0f);
mapReward.put("CiMin",6.0f);
mapReward.put("CiMax",6.0f);rewardNameList.add("j");mapReward.put("totalj", 22.0f);mapReward.put("policyj", 0.0f);mapReward.put("weightj", 0.0f);
mapReward.put("Aj",6.0f);
mapReward.put("AjMin",6.0f);
mapReward.put("AjMax",6.0f);
mapReward.put("Bj",6.0f);
mapReward.put("BjMin",6.0f);
mapReward.put("BjMax",6.0f);
mapReward.put("Cj",6.0f);
mapReward.put("CjMin",6.0f);
mapReward.put("CjMax",6.0f);rewardNameList.add("k");mapReward.put("totalk", 22.0f);mapReward.put("policyk", 0.0f);mapReward.put("weightk", 0.0f);
mapReward.put("Ak",6.0f);
mapReward.put("AkMin",6.0f);
mapReward.put("AkMax",6.0f);
mapReward.put("Bk",6.0f);
mapReward.put("BkMin",6.0f);
mapReward.put("BkMax",6.0f);
mapReward.put("Ck",6.0f);
mapReward.put("CkMin",6.0f);
mapReward.put("CkMax",6.0f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
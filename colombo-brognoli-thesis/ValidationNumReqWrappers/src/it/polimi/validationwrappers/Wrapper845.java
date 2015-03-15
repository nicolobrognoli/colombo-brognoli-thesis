
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper845{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper845(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.08345533106142614f);
mapReward.put("AtimeMax",0.04590391904304416f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.019860697354297095f);
mapReward.put("BtimeMax",0.08044531972347732f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.022223641120123483f);
mapReward.put("CtimeMax",0.023359027634350084f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1155.1308523879682f);
mapReward.put("AhMax",1163.728950189796f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1157.8549649976715f);
mapReward.put("BhMax",1157.8029762194308f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1162.3949490859986f);
mapReward.put("ChMax",1163.293662335242f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
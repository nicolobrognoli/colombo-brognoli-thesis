
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1751{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1751(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.09212910926137213f);
mapReward.put("AtimeMax",0.05040421413788313f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.056721124810247145f);
mapReward.put("BtimeMax",0.013730590779942032f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06469944284306747f);
mapReward.put("CtimeMax",0.0157895507781603f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",252.0452055156404f);
mapReward.put("AhMax",251.8392027909491f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",254.9777537300317f);
mapReward.put("BhMax",255.2965159181308f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",256.22270258557745f);
mapReward.put("ChMax",250.40718286345745f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
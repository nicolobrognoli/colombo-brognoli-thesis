
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1272{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1272(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.016137669586733194f);
mapReward.put("AtimeMax",0.05868372756456762f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.029113621912450593f);
mapReward.put("BtimeMax",0.03877358467445006f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.08691126838181802f);
mapReward.put("CtimeMax",0.05871181621899428f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",734.9686391025414f);
mapReward.put("AhMax",728.817241695181f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",733.47437548794f);
mapReward.put("BhMax",728.0302476842155f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",734.8365807277539f);
mapReward.put("ChMax",733.3581350542257f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}

package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper1468{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper1468(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.01854529111423616f);
mapReward.put("AtimeMax",0.043018157807831046f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.007960304355577097f);
mapReward.put("BtimeMax",0.02579168245194201f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.06384344153263531f);
mapReward.put("CtimeMax",0.04948838644354906f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",536.9989914499145f);
mapReward.put("AhMax",537.2172731945533f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",535.2516360788543f);
mapReward.put("BhMax",536.4012364461729f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",537.2271588778881f);
mapReward.put("ChMax",538.5284877328853f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
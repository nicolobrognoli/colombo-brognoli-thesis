
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper945{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper945(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.04574099064760038f);
mapReward.put("AtimeMax",0.09775021876771214f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.033320532390185086f);
mapReward.put("BtimeMax",0.07446468423589093f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.024211290901752135f);
mapReward.put("CtimeMax",0.096173867775245f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1056.8638958771949f);
mapReward.put("AhMax",1059.0056639396084f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1063.248904833658f);
mapReward.put("BhMax",1055.1039943561482f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1057.6994881081769f);
mapReward.put("ChMax",1057.4919660784763f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}
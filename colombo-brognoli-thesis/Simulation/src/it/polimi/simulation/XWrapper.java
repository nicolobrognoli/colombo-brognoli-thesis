package it.polimi.simulation;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class XWrapper implements X {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public XWrapper(){

 		rewardNameList.add("time");
		mapReward.put("totaltime", 40.0f);
		mapReward.put("weighttime", 0.7f);
		mapReward.put("BtimeMin", 10.0f);
		mapReward.put("BtimeMax", 18.0f);
		mapReward.put("Btime", 6.0f);
		alternatives.add("B");
		mapReward.put("AtimeMin", 3.0f);
		mapReward.put("AtimeMax", 13.0f);
		mapReward.put("Atime", 2.0f);
		alternatives.add("A");
		mapReward.put("policytime",0.0f);
 		rewardNameList.add("usability");
		mapReward.put("totalusability", 13.0f);
		mapReward.put("weightusability", 0.3f);
		mapReward.put("BusabilityMin", 5.0f);
		mapReward.put("BusabilityMax", 8.0f);
		mapReward.put("Busability", 2.0f);
		mapReward.put("AusabilityMin", 4.0f);
		mapReward.put("AusabilityMax", 9.0f);
		mapReward.put("Ausability", 2.0f);
		mapReward.put("policyusability",1.0f);
	}

	public void boo(){
		AlternativeUtility.startTimer();
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);
		X obj=null;
		if(choice.equals("B")){
			 obj = new B();
		}
		if(choice.equals("A")){
			 obj = new A();
		}
		obj.boo();
		AlternativeUtility.stopTimer();
		AlternativeUtility.updateContext(rewardNameList,choice,mapReward);
	}

}
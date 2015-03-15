package it.polimi.simulation;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class YWrapper implements Y {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public YWrapper(){

 		rewardNameList.add("time");
		mapReward.put("totaltime", 40.0f);
		mapReward.put("weighttime", 0.7f);
		mapReward.put("EtimeMin", 12.0f);
		mapReward.put("EtimeMax", 12.0f);
		mapReward.put("Etime", 10.0f);
		alternatives.add("E");
		mapReward.put("DtimeMin", 8.0f);
		mapReward.put("DtimeMax", 8.0f);
		mapReward.put("Dtime", 6.0f);
		alternatives.add("D");
		mapReward.put("CtimeMin", 4.0f);
		mapReward.put("CtimeMax", 4.0f);
		mapReward.put("Ctime", 2.0f);
		alternatives.add("C");
		mapReward.put("policytime",0.0f);
 		rewardNameList.add("usability");
		mapReward.put("totalusability", 13.0f);
		mapReward.put("weightusability", 0.3f);
		mapReward.put("EusabilityMin", 6.0f);
		mapReward.put("EusabilityMax", 6.0f);
		mapReward.put("Eusability", 4.0f);
		mapReward.put("DusabilityMin", 5.0f);
		mapReward.put("DusabilityMax", 5.0f);
		mapReward.put("Dusability", 3.0f);
		mapReward.put("CusabilityMin", 3.0f);
		mapReward.put("CusabilityMax", 3.0f);
		mapReward.put("Cusability", 1.0f);
		mapReward.put("policyusability",1.0f);
	}

	public void foo(){
		AlternativeUtility.startTimer();
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);
		Y obj=null;
		if(choice.equals("E")){
			 obj = new E();
		}
		if(choice.equals("D")){
			 obj = new D();
		}
		if(choice.equals("C")){
			 obj = new C();
		}
		obj.foo();
		AlternativeUtility.stopTimer();
		AlternativeUtility.updateContext(rewardNameList,choice,mapReward);
	}

}
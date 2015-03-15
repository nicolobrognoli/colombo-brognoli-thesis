package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class LocationInterfaceWrapper implements LocationInterface {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public LocationInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("totaltime", 22.0f);
		mapReward.put("weighttime", 0.7f);
		mapReward.put("LocationNPStimeMin", 10.0f);
		mapReward.put("LocationNPStimeMax", 15.0f);
		alternatives.add("LocationNPS");
		mapReward.put("LocationNPStime", 3.0f);
		mapReward.put("LocationGPStimeMin", 9.0f);
		mapReward.put("LocationGPStimeMax", 14.0f);
		alternatives.add("LocationGPS");
		mapReward.put("LocationGPStime", 2.0f);
		mapReward.put("policytime",0.0f);
		rewardNameList.add("usability");
		mapReward.put("totalusability", 17.0f);
		mapReward.put("weightusability", 0.3f);
		mapReward.put("LocationNPSusabilityMin", 6.0f);
		mapReward.put("LocationNPSusabilityMax", 11.0f);
		mapReward.put("LocationNPSusability", 2.0f);
		mapReward.put("LocationGPSusabilityMin", 5.0f);
		mapReward.put("LocationGPSusabilityMax", 10.0f);
		mapReward.put("LocationGPSusability", 1.0f);
		mapReward.put("policyusability",1.0f);
	}

	public void getLocation(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);
		LocationInterface obj = null;
		if(choice.equals("LocationNPS")){
			 obj = new LocationNPS();
		}
		if(choice.equals("LocationGPS")){
			 obj = new LocationGPS();
		}
		obj.getLocation();
		AlternativeUtility.updateContext(rewardNameList, choice, mapReward);
	}

}
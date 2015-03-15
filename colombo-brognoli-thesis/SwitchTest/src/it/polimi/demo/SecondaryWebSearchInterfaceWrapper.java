package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class SecondaryWebSearchInterfaceWrapper implements SecondaryWebSearchInterface {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public SecondaryWebSearchInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("totaltime", 22.0f);
		mapReward.put("weighttime", 0.7f);
		mapReward.put("SecondaryWebSearchtimeMin", 6.0f);
		mapReward.put("SecondaryWebSearchtimeMax", 7.0f);
		alternatives.add("SecondaryWebSearch");
		mapReward.put("SecondaryWebSearchtime", 4.0f);
		mapReward.put("policytime",0.0f);
		rewardNameList.add("usability");
		mapReward.put("totalusability", 17.0f);
		mapReward.put("weightusability", 0.3f);
		mapReward.put("SecondaryWebSearchusabilityMin", 4.0f);
		mapReward.put("SecondaryWebSearchusabilityMax", 6.0f);
		mapReward.put("SecondaryWebSearchusability", 3.0f);
		mapReward.put("policyusability",1.0f);
	}

	public void secondaryWebSearch(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);
		SecondaryWebSearchInterface obj = null;
		if(choice.equals("SecondaryWebSearch")){
		obj = new SecondaryWebSearch();
		obj.secondaryWebSearch();
		AlternativeUtility.updateContext(rewardNameList, "SecondaryWebSearch", mapReward);
		}
	}

}
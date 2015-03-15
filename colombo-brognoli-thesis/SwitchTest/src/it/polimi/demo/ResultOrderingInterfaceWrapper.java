package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class ResultOrderingInterfaceWrapper implements ResultOrderingInterface {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public ResultOrderingInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("totaltime", 22.0f);
		mapReward.put("weighttime", 0.7f);
		mapReward.put("ResultOrderingtimeMin", 3.0f);
		mapReward.put("ResultOrderingtimeMax", 3.0f);
		alternatives.add("ResultOrdering");
		mapReward.put("ResultOrderingtime", 1.0f);
		mapReward.put("policytime",0.0f);
		rewardNameList.add("usability");
		mapReward.put("totalusability", 17.0f);
		mapReward.put("weightusability", 0.3f);
		mapReward.put("ResultOrderingusabilityMin", 3.0f);
		mapReward.put("ResultOrderingusabilityMax", 3.0f);
		mapReward.put("ResultOrderingusability", 2.0f);
		mapReward.put("policyusability",1.0f);
	}

	public List<String> ordering(List<String> results){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);
		ResultOrderingInterface obj = null;
		if(choice.equals("ResultOrdering")){
		obj = new ResultOrdering();
		List<String> val =  obj.ordering(results);
		AlternativeUtility.updateContext(rewardNameList, "ResultOrdering", mapReward);
		return val;
		}
	return null;
	}

}
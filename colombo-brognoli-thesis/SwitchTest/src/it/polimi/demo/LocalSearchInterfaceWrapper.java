package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class LocalSearchInterfaceWrapper implements LocalSearchInterface {

private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public LocalSearchInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("LocalSearchtime", 2.0f);
		rewardNameList.add("usability");
		mapReward.put("LocalSearchusability", 1.0f);
	}

	public List<String> localSearch(String product){
		LocalSearchInterface obj = new LocalSearch();
		List<String> val =  obj.localSearch(product);
		AlternativeUtility.updateContext(rewardNameList, "LocalSearch", mapReward);
		return val;
	}

}
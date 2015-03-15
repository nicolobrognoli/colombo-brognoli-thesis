package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class WebSearchInterfaceWrapper implements WebSearchInterface {

private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public WebSearchInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("WebSearchtime", 3.0f);
		rewardNameList.add("usability");
		mapReward.put("WebSearchusability", 2.0f);
	}

	public List<String> webSearch(String product){
		WebSearchInterface obj = new WebSearch();
		List<String> val =  obj.webSearch(product);
		AlternativeUtility.updateContext(rewardNameList, "WebSearch", mapReward);
		return val;
	}

}
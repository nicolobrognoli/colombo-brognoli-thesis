package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class PublishPriceInterfaceWrapper implements PublishPriceInterface {

private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public PublishPriceInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("PublishPricetime", 2.0f);
		rewardNameList.add("usability");
		mapReward.put("PublishPriceusability", 1.0f);
	}

	public void publish(String product,float prize){
		PublishPriceInterface obj = new PublishPrice();
		obj.publish(product, prize);
		AlternativeUtility.updateContext(rewardNameList, "PublishPrice", mapReward);
	}

}
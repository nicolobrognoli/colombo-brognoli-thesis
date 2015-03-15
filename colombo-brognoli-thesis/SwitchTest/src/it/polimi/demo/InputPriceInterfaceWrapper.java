package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class InputPriceInterfaceWrapper implements InputPriceInterface {

private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public InputPriceInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("InputPricetime", 3.0f);
		rewardNameList.add("usability");
		mapReward.put("InputPriceusability", 1.0f);
		AlternativeUtility.start(rewardNameList);
	}

	public void inputPrice(int price){
		InputPriceInterface obj = new InputPrice();
		obj.inputPrice(price);
		AlternativeUtility.updateContext(rewardNameList, "InputPrice", mapReward);
	}

}
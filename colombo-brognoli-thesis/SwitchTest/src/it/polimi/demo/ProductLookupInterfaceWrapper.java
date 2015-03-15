package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class ProductLookupInterfaceWrapper implements ProductLookupInterface {

private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public ProductLookupInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("ProductLookuptime", 2.0f);
		rewardNameList.add("usability");
		mapReward.put("ProductLookupusability", 1.0f);
	}

	public void lookUp(String barcode){
		ProductLookupInterface obj = new ProductLookup();
		obj.lookUp(barcode);
		AlternativeUtility.updateContext(rewardNameList, "ProductLookup", mapReward);
	}

}
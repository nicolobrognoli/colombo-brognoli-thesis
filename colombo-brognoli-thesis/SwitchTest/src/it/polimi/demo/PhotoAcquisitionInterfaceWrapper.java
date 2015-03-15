package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class PhotoAcquisitionInterfaceWrapper implements PhotoAcquisitionInterface {

private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public PhotoAcquisitionInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("PhotoAcquisitiontime", 2.0f);
		rewardNameList.add("usability");
		mapReward.put("PhotoAcquisitionusability", 2.0f);
	}

	public void getPhoto(){
		PhotoAcquisitionInterface obj = new PhotoAcquisition();
		obj.getPhoto();
		AlternativeUtility.updateContext(rewardNameList, "PhotoAcquisition", mapReward);
	}

}
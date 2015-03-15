package it.polimi.demo;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class RecognitionInterfaceWrapper implements RecognitionInterface {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();

	public RecognitionInterfaceWrapper(){
		rewardNameList.add("time");
		mapReward.put("totaltime", 22.0f);
		mapReward.put("weighttime", 0.7f);
		mapReward.put("RemoteRecognitiontimeMin", 13.0f);
		mapReward.put("RemoteRecognitiontimeMax", 19.0f);
		alternatives.add("RemoteRecognition");
		mapReward.put("RemoteRecognitiontime", 2.0f);
		mapReward.put("LocalRecognitiontimeMin", 12.0f);
		mapReward.put("LocalRecognitiontimeMax", 18.0f);
		alternatives.add("LocalRecognition");
		mapReward.put("LocalRecognitiontime", 1.0f);
		mapReward.put("policytime",0.0f);
		rewardNameList.add("usability");
		mapReward.put("totalusability", 17.0f);
		mapReward.put("weightusability", 0.3f);
		mapReward.put("RemoteRecognitionusabilityMin", 9.0f);
		mapReward.put("RemoteRecognitionusabilityMax", 15.0f);
		mapReward.put("RemoteRecognitionusability", 3.0f);
		mapReward.put("LocalRecognitionusabilityMin", 7.0f);
		mapReward.put("LocalRecognitionusabilityMax", 13.0f);
		mapReward.put("LocalRecognitionusability", 1.0f);
		mapReward.put("policyusability",1.0f);
	}

	public void recognize(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);
		RecognitionInterface obj = null;
		if(choice.equals("RemoteRecognition")){
			 obj = new RemoteRecognition();
		}
		if(choice.equals("LocalRecognition")){
			 obj = new LocalRecognition();
		}
		obj.recognize();
		AlternativeUtility.updateContext(rewardNameList, choice, mapReward);
	}

}
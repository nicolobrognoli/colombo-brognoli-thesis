


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarterWrapper implements ActivityInterface {
	private Map<String,Float> mapReward = new HashMap<String,Float>();
	private List<String> rewardNameList = new ArrayList<String>();
	private List<String> alternatives = new ArrayList<String>();
	
	public StarterWrapper(){
		mapReward.put("totaltime", 22.0f);
		mapReward.put("weighttime", 0.7f);
		mapReward.put("AtimeMin", 10.0f);
		mapReward.put("AtimeMax", 15.0f);
		alternatives.add("A");
		mapReward.put("Atime", 3.0f);
		mapReward.put("BtimeMin", 9.0f);
		mapReward.put("BtimeMax", 14.0f);
		alternatives.add("B");
		mapReward.put("Btime", 2.0f);
		mapReward.put("CtimeMin", 9.0f);
		mapReward.put("CtimeMax", 14.0f);
		alternatives.add("C");
		mapReward.put("Ctime", 2.0f);
		mapReward.put("policytime",0.0f);
		mapReward.put("totalusability", 17.0f);
		mapReward.put("weightusability", 0.3f);
		mapReward.put("AusabilityMin", 6.0f);
		mapReward.put("AusabilityMax", 11.0f);
		mapReward.put("Ausability", 2.0f);
		mapReward.put("BusabilityMin", 5.0f);
		mapReward.put("BusabilityMax", 10.0f);
		mapReward.put("Busability", 1.0f);
		mapReward.put("CusabilityMin", 5.0f);
		mapReward.put("CusabilityMax", 10.0f);
		mapReward.put("Cusability", 1.0f);
		mapReward.put("policyusability",1.0f);
		
		
		
		
		rewardNameList.add("time");
		rewardNameList.add("usability");
		AlternativeUtility.start(rewardNameList);
	}
	@Override
	public void doActivity() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AlternativeUtility.updateContext(rewardNameList, "A", mapReward);
	}

}

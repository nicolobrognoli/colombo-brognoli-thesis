package it.polimi.simulation;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class YWrapper implements Y {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private float context;

	public YWrapper(float context){
		this.context=context;
 		rewardNameList.add("time");
		mapReward.put("totaltime", new Float(40.0));
		mapReward.put("EtimeMin", new Float(12.0));
		mapReward.put("EtimeMax", new Float(12.0));
		alternatives.add("E");
		mapReward.put("DtimeMin", new Float(8.0));
		mapReward.put("DtimeMax", new Float(8.0));
		alternatives.add("D");
		mapReward.put("CtimeMin", new Float(4.0));
		mapReward.put("CtimeMax", new Float(4.0));
		alternatives.add("C");
	}

	public String getString(){
		String choice = AlternativeUtility.getAlternative(context,alternatives,rewardNameList,mapReward);
		Y obj=null;
		if(choice.equals("E")){
			 obj = new E();
		}
		if(choice.equals("D")){
			 obj = new D();
		}
		if(choice.equals("C")){
			 obj = new C();
		}
		return obj.getString();
	}

}
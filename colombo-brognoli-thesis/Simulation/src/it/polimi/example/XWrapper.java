package it.polimi.example;
import java.util.List; 
import java.util.Map; 
import java.util.HashMap;
import java.util.ArrayList;
public class XWrapper implements X {

private List<String> alternatives = new ArrayList<String>();
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private float context;

	public XWrapper(float context){
		this.context=context;
 		rewardNameList.add("time");
		mapReward.put("totaltime", new Float(40.0));
		mapReward.put("BtimeMin", new Float(10.0));
		mapReward.put("BtimeMax", new Float(18.0));
		alternatives.add("B");
		mapReward.put("AtimeMin", new Float(3.0));
		mapReward.put("AtimeMax", new Float(13.0));
		alternatives.add("A");
	}

	public void foo(){
		String choice = AlternativeUtility.getAlternative(context,alternatives,rewardNameList,mapReward);
		X obj=null;
		if(choice.equals("B")){
			 obj = new B();
		}
		if(choice.equals("A")){
			 obj = new A();
		}
		obj.foo();
	}
	public int goo(int x, float y){
		String choice = AlternativeUtility.getAlternative(context,alternatives,rewardNameList,mapReward);
		X obj=null;
		if(choice.equals("B")){
			 obj = new B();
		}
		if(choice.equals("A")){
			 obj = new A();
		}
		return obj.goo(x, y);
	}
	public int getInt(){
		String choice = AlternativeUtility.getAlternative(context,alternatives,rewardNameList,mapReward);
		X obj=null;
		if(choice.equals("B")){
			 obj = new B();
		}
		if(choice.equals("A")){
			 obj = new A();
		}
		return obj.getInt();
	}

}
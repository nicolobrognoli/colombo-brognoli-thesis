package it.polimi.thesis.generator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class State {
	private int id;
	private String interfaceName;
	private String className;
	private List<String> rewardsName;
	private Map<String, Float> rewardsList;
	private boolean isOptional;/*TODO per ora ho inserito questo booleano, ma conviene? Per l'optionality non usiamo l'interface.Creare
	"State" come sottoclasse di OptionalState e aggiungerli l'attributo in più interfaceName*/ 
	
	public State(int id, List<String> nameList){
		super();
		this.id = id;
		this.interfaceName = "";
		this.className = "";
		this.rewardsList  = new HashMap<String, Float>();
		this.rewardsName = nameList;
	}
	
	public State(int id, String interfaceName, String className, Map<String, Float> list, List<String> nameList) {
		super();
		this.id = id;
		this.interfaceName = interfaceName;
		this.className = className;
		this.rewardsList = list;
		this.rewardsName = nameList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public String toString(){
		String str = "ID: " + this.id +" - Interface: " + this.interfaceName + " Class: " + this.className;	
	    Iterator<?> it = this.rewardsList.entrySet().iterator();
	    while (it.hasNext()) {
	        @SuppressWarnings("rawtypes")
			Map.Entry pairs = (Map.Entry)it.next();
	        str += "\n"  + pairs.getKey() + " = " + pairs.getValue();
	    }	
		return str;
	}
	
	public void addMaxReward(String name,float value){
		this.rewardsList.put(name+"Max", value);
	}
	public void addMinReward(String name,float value){
		this.rewardsList.put(name+"Min", value);
	}	
	public float getMaxReward(String name){
		return this.rewardsList.get(name+"Max");
	}
	public float getMinReward(String name){
		return this.rewardsList.get(name+"Min");
	}
	
	public List<String> getRewardList(){
		return this.rewardsName;
	}
	public void addTotalReward(String name,float value){
		this.rewardsList.put("total"+name, value);
	}
	public float getTotalReward(String name){
		return this.rewardsList.get("total"+name);
	}
	public void addWeightReward(String name,float value){
		this.rewardsList.put("weight"+name, value);
	}
	public float getWeightReward(String name){
		return this.rewardsList.get("weight"+name);
	}
	public void addStateReward(String name, float value){
		this.rewardsList.put(name, value);
	}
	public float getStateReward(String name){
		return this.rewardsList.get(name);
	}

	public boolean isOptional() {
		return isOptional;
	}

	public void setOptional(boolean isOptional) {
		this.isOptional = isOptional;
	}
}

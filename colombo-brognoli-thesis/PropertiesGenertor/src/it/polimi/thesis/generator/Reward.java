package it.polimi.thesis.generator;

public class Reward {
	private String name;
	private String policy;
	private float weight;
	private float total;//inserted by the user
	
	public Reward(String name){
		this.name=name;
	}
	
	public Reward(String name,float total){
		this.name=name;
		this.total=total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	@Override
	public boolean equals(Object o){
		if(this.name.equals(((Reward) o).getName()))
			return true;
		return false;
	}
}

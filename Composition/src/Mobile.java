
public class Mobile {
	private String make;
	private String model;
	Sim sim;
	public Mobile(String make, String model,Sim sim) {
		this.make = make;
		this.model = model;
		this.sim=sim;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
}


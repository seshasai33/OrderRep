
public class Mobile {
	private String make;
	private String model;
	MemoryCard memoryCard;
	Sim sim;
	public Mobile(String make, String model) {
		this.make = make;
		this.model = model;
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
}

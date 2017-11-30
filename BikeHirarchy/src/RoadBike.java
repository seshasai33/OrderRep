
public class RoadBike extends Bicycle{
	String extraWheels;
	public RoadBike(int cadence, double currentSpeed,int currentGear,String extraWheels) {
		super(cadence,currentSpeed,currentGear);
		this.extraWheels=extraWheels;
	}
	public void printRoadBike() {
		System.out.println("extraWheels :"+extraWheels);		
	}
}

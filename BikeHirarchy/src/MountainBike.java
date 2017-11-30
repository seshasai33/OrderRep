
public class MountainBike extends Bicycle{
	String bikeLights;	 
	public MountainBike(int cadence, double currentSpeed,int currentGear,String bikeLights) {
		super(cadence,currentSpeed,currentGear);
		this.bikeLights=bikeLights;
	}
	public void printMountainBike() {
		System.out.println("bikeLights :"+bikeLights);		
	}
}

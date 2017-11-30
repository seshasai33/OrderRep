
public class TandemBike extends Bicycle{
	int noOfPedals;
	public TandemBike(int cadence, double currentSpeed,int currentGear,int noOfPedals) {
		super(cadence,currentSpeed,currentGear);
		this.noOfPedals=noOfPedals;
	}
	public void printTandemBike() {
		System.out.println("noOfPedals :"+noOfPedals);		
	}

}

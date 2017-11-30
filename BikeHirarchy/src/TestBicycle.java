
public class TestBicycle {

	public static void main(String[] args) {
		Bicycle b=new Bicycle(500,10.0,2);
		MountainBike mb=new MountainBike(500, 10.0, 2, "YES");
		RoadBike rb=new RoadBike(500, 10.0, 2, "YES");
		TandemBike tb=new TandemBike(500, 10.0, 2, 2);
		mb.printMountainBike();
		rb.printRoadBike();
		tb.printTandemBike();
		b.changeGear(3);
		b.changeCadence(600);
		b.printDetails();
 
	}

}

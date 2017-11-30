
public class Bicycle implements BicycleInterface {
int cadence;
double currentSpeed;
int currentGear;
public Bicycle() {
}
public Bicycle(int cadence, double currentSpeed,int currentGear) {
	this.cadence = cadence;
	this.currentSpeed = currentSpeed;
}
public void changeGear(int value) {
	this.currentGear=value;
}
public void changeCadence(int value) {
	this.cadence=value;
}
@Override
public void applyBrake() {
	this.currentSpeed=0;
}
public void printDetails() {
	System.out.println("Current Speed :"+currentSpeed);
	System.out.println("Current Gear :"+currentGear);
	System.out.println("Current Cadence :"+cadence);
}

}

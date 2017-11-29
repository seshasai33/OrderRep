
public class CylinderArea {
	private double r;
	private double h;
	double area;
	double circleArea;
	double rectangleArea;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double circleArea() {
		return circleArea=3.14*r*r;
	}
	public double rectangleArea() {
		return rectangleArea=(h*(2*3.14*r));
	}
	public CylinderArea(double r,double h) {
		this.r=r;
		this.h=h;
	}
	public void printCylinderArea() {
		area=2*circleArea()+rectangleArea();
		System.out.println(area);
	}
	
}


public class Rectangle {
	protected double widght;
	protected double height;
	
	public Rectangle(double w, double h) {
		this.widght=w;
		this.height=h;
	}
	
	public double getArea() {
		return this.height*this.widght;
	}
}

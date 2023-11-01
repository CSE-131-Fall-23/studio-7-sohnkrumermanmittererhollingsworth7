package studio7;

public class Rectangle {
	private double length;
	private double width;


	public Rectangle(double RectWidth, double RectLength) {
		length = RectLength;
		width = RectWidth;
	}
	public double area() {
		return length*width;
	}
	public double perimeter() {
		return ((2*width)+(2*length));
	}
	public boolean squareCheck() {
		if(length == width) {
			return true;
		}else {
			return false;
		}
	}
	public boolean Comparison(Rectangle r2) {
		if (this.area() > r2.area()) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Rectangle r1= new Rectangle(5,10);
		Rectangle r2 = new Rectangle(6, 12);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(r1.squareCheck());
		System.out.println(r1.Comparison(r2));
	}
}
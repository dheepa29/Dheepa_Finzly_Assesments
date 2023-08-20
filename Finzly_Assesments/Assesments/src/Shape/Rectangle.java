package shape;

public class Rectangle implements Shape {
	private double l;
	private double b;
	
	
	
	
	
	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	@Override
	public void calculateArea() {
		System.out.println(l*b);
	}
	@Override
	public void calculatePerimeter() {
		System.out.println((l+b)*2);	
	}
}

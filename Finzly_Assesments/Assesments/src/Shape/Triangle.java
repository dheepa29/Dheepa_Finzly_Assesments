package shape;

public class Triangle implements Shape{
	private double l;
	private double b;
	private double c;
	
	
	
	public Triangle(double l, double b, double c) {
		super();
		this.l = l;
		this.b = b;
		this.c = c;
	}
	@Override
	public void calculateArea() {
		System.out.println(l*b*0.5);
	}
	@Override
	public void calculatePerimeter() {
		System.out.println(l+b+c);
	}
	
	
}

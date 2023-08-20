package shape;

public class Circle implements Shape {
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		System.out.println(radius*radius*3.14);
	}
	
	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println(2*3.14*radius);
	}
}

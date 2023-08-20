package shape;

public class Main {
	public static void main(String[] args) {
		Shape r = new Rectangle(12,22);
		r.calculateArea();
		r.calculatePerimeter();
		Shape t = new Triangle(1,2,3);
		t.calculateArea();
		t.calculatePerimeter();
		Shape c = new Circle(3.2);
		c.calculateArea();
		c.calculatePerimeter();
	}
}

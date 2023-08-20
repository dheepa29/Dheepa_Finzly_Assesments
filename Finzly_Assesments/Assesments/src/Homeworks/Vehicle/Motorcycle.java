package vehicle;

public class Motorcycle implements Vehicle {

	@Override
	public void start() {
		System.out.println("The Motorcyle is on");
	}

	@Override
	public void accelerate() {
		System.out.println("The Motorcycle is accelerating");
	}

	@Override
	public void brake() {
		System.out.println("The Motorcycle is braking");
	}

}

package vehicle;

public class Main {

	
	public static void main(String[] args) {
	
		Vehicle bike = new Motorcycle();
		Vehicle car = new Car();
		
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = bike;
		vehicles[1] = car;
		
		for(Vehicle v: vehicles) {
			v.start();
			v.accelerate();
			v.brake();
			System.out.println();
		}
		
				
	}
}

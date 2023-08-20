package animal;

public class Lion extends Animal {
	Lion(String name, int age){
		super(name, age);
	}
	void makeSound() {
		System.out.println("Lion Noise");
	}
}

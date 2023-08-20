package animal;

public class Elephant extends Animal{

	Elephant(String name, int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("Elephant Noise");
	}
}

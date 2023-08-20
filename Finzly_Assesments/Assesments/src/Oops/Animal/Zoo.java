package animal;

import java.util.Arrays;
import java.util.List;

public class Zoo {
 
	public static void main(String[] args) {
		List<Animal> animals = Arrays.asList(new Lion("Lion",12), new Giraffe("Giraffe",22),
				new Elephant("Elephant",33), new Animal("Animal",33));
		for(Animal a : animals) {
			a.makeSound();
		}
		
	}
}

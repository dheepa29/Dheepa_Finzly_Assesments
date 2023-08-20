package employee;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Manager[] managers = new Manager[3];
		for(int i = 0;i<3;i++) {
			managers[i] = new Manager("Developer","Manager"+i,"MAN"+i);
		}
		
		Developer[] developers = new Developer[3];
		for(int i = 0;i<3;i++) {
			developers[i] = new Developer("Python","Developer"+i,"DEV"+i);
		}
		
		for(Manager m : managers) {
			System.out.println(m);
		}
		
		System.out.println();
		
		for(Developer d : developers) {
			System.out.println(d);
		}
		
	}
}

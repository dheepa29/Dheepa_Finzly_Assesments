package antivirus;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			AntiVirus a1 = new AntiVirus();
			
			if(a1.isActivated()) {
				System.out.println("Already activated");
			}else {
				a1.purchase();
			}
	}
	
	
}

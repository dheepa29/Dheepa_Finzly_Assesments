package antivirus;

import java.util.Scanner;
public class AntiVirus {
	
	private String name;
	private boolean isActivated;
	
	
	
	AntiVirus(){
		this("None");
	}
	AntiVirus(String name){
		this(name,false);
	}
	AntiVirus(String name, boolean isActivated){
		this.name = name;
		this.isActivated = isActivated;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActivated() {
		return isActivated;
	}
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	public  void purchase() {
		if(!isActivated) {
		final int productKey;					//final product key for user
		System.out.println("You are using a free version. Press 1 to upgrade : ");
		Scanner sc = new Scanner(System.in);
		int money;
		if(sc.nextInt()==1) {
			System.out.println("Premium cost is 1000 \n Enter your money : ");
			money = sc.nextInt();
			Transaction t = new Transaction();
			productKey = t.activate(money);    // Transaction Class returning the product key
			if(Transaction.productKeyList.contains(productKey)) {
				System.out.println("You are a premium user and your prodcutKey is : "+productKey);
			}else {
				System.out.println("You are using free verion");
			}
		}}else {
			System.out.println("Already purchased");
		}
	}
	 
}

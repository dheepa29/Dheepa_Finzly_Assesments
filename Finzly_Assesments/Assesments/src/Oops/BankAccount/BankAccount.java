
public class BankAccount {
	private double accNo;
	private double balance;
	private String name;
	
	BankAccount(String name,double accNo, double balance){
		this.accNo  = accNo;
		this.balance = balance;
		this.name = name;
	}

	public double getAccNo() {
		return accNo;
	}


	public void getBalance() {
		System.out.println("Balance : "+ balance);
	}


	public String getName() {
		return name;
	}
	
	public void deposit(double money) {
		balance+=money;
		System.out.println("After deposit balance : "+ balance);
	}
	public void withdraw(double money) {
		if(this.balance < money) {
			System.out.println("Insufficient Balance");
		}else {
			balance-= money;
			System.out.println("After withdraw balance : "+ balance);
		}
	}
	
}

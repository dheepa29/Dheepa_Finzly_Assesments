package bankaccountabstract;

public class SavingsAccount extends BankAccount{

	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void setAccountNumber(String accountNumber) {
		super.accountNumber = accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		super.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		super.balance = balance;
	}
	

	@Override
	String getAccountNumber() {
		// TODO Auto-generated method stub
		return super.accountNumber;
	}

	@Override
	String getAccountHolderName() {
		// TODO Auto-generated method stub
		return super.accountHolderName;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return super.balance;
	}

	@Override
	void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Please enter a valid amount!!");
		}else {
			super.balance += amount;
			System.out.println("Successfully deposited");
		}
		
	}

	@Override
	void withdraw(double amount) {
		if(amount>getBalance()) {
			System.out.println("Insufficient balance");
		}else {
			super.balance -= amount;
			System.out.println("Successfully withdrawn");
		}
		
	}

}

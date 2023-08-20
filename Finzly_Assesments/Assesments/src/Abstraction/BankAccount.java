package bankaccountabstract;

public abstract class BankAccount {
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	abstract String getAccountNumber();
	abstract String getAccountHolderName();
	abstract double getBalance();
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
	
}

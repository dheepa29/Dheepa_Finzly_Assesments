package bankaccountabstract;

public class CheckinAccount  extends BankAccount{
	private double overDraftLimit;
	
	
	
	
	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
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
		return super.accountHolderName;
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
			System.out.println("Please provide a valid amount");
		}else {
			super.balance+=amount;
			System.out.println("Successfully Deposited");
		}
		
	}

	@Override
	void withdraw(double amount) {
		if(amount>overDraftLimit) {
			System.out.println("Limit reached, your limit "+overDraftLimit);
		}else {
			super.balance-=amount;
			System.out.println("Successfully withdrawn");
		}
	}

}

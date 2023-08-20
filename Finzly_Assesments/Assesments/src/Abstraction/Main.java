package bankaccountabstract;

public class Main {
		
		public static void main(String[] args) {
			
			//Savings Account 
			System.out.println("Savings Account");
			SavingsAccount savingsAccount = new SavingsAccount();  // creating savings account
			savingsAccount.setInterestRate(8);					   // providing interest
			System.out.println(savingsAccount.getInterestRate());  // displaying interest rate 
			
			
			
			//setting account details
			savingsAccount.setAccountHolderName("Mithulbhalaji");  
			savingsAccount.setAccountNumber("123455");
			savingsAccount.setBalance(2000);
			savingsAccount.setInterestRate(6);
			
			//withdrawing and depositing
			savingsAccount.withdraw(4000);
			savingsAccount.deposit(2000);
			savingsAccount.getBalance();
			savingsAccount.withdraw(1000);
			System.out.println(savingsAccount.getBalance());
			System.out.println();
			
			//Checkin Account
			System.out.println("Check In Account");
			CheckinAccount checkinAccount = new CheckinAccount();     // creating check in account
			//setting account details
			checkinAccount.setAccountHolderName("Bhalaji");
			checkinAccount.setAccountNumber("23456");
			checkinAccount.setBalance(2000);
			checkinAccount.setOverDraftLimit(3000);
			
			//withdrawing and depositing
			System.out.println(checkinAccount.getBalance());
			checkinAccount.deposit(3000);
			System.out.println(checkinAccount.getBalance());
			checkinAccount.withdraw(1000);
			checkinAccount.withdraw(4000);
	

		
			
		}
		
}

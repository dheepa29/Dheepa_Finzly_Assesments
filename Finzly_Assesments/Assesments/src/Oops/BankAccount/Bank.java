
public class Bank {
		public static void main(String[] args) {
			BankAccount bc1  = new BankAccount("Bhalaji",64838382,100);
			BankAccount bc2  = new BankAccount("mithul",64838383,100);
			bc1.deposit(500);
			bc1.getBalance();
			bc1.withdraw(100);
			bc2.getBalance();
		}
}

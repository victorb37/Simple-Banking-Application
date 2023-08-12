
public class BankingApp {

	public static void main(String[] args) {
		
		AccountInfo account1 = new AccountInfo("87654321", 0.0, "Michael", "Jackson", "4321");
		System.out.println(account1.getFirstName() + " " + account1.getLastName());
		System.out.println("Account Number: " + account1.getAccountNum());
		System.out.println("Pin Hash: " + account1.getPinHash());
		account1.depositBalance(100000);
		account1.withdrawBalance(13123.79);
		account1.getBalance();
		
		
		System.out.println("\n\n");
		
		
		AccountInfo account2 = new AccountInfo("12345678", 0.0, "Sam", "Smith", "1234");
		account2.depositBalance(1000.00);
		account2.getBalance();
		System.out.println();
		account2.withdrawBalance(5000.00);
		System.out.println();
		account2.depositBalance(20000.00);
		account2.withdrawBalance(5000.00);
		account2.getBalance();
		
	}

}

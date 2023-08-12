
public class BankingApp {

	public static void main(String[] args) {
		
		AccountInfo account2 = new AccountInfo("87654321", 0.0, "Michael", "Jackson", "4321");
		System.out.println(account2.getFirstName() + " " + account2.getLastName());
		System.out.println("Account Number: " + account2.getAccountNum());
		System.out.println("Pin Hash: " + account2.getPinHash());
		account2.depositBalance(100000);
		account2.withdrawBalance(13123.79);
		account2.getBalance();
		
		
		System.out.println("\n\n");
		
		
		AccountInfo account1 = new AccountInfo("12345678", 0.0, "Sam", "Smith", "1234");
		account1.depositBalance(1000.00);
		account1.getBalance();
		System.out.println();
		account1.withdrawBalance(5000.00);
		System.out.println();
		account1.depositBalance(20000.00);
		account1.withdrawBalance(5000.00);
		account1.getBalance();
		
	}

}

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

public class AccountInfo {
	
	private static final Logger logger = Logger.getLogger(AccountInfo.class.getName());
	
	private String accountNum;
	private double balance;
	private String firstName;
	private String lastName;
	private byte[] pinHash;
	
	
	public AccountInfo(String accountNum, double balance, String firstName, String lastName, String pin) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		// Testing MessageDigest - however, no real functional use for this code
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinHash = md.digest(pin.getBytes());
		}
		catch (NoSuchAlgorithmException e) {
			System.err.println("Error: NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void depositBalance(double amount) {
		balance += amount;
	}
	
	public void withdrawBalance(double amount) {
		if (amount > balance) {
			System.out.println("You cannot withdraw more than your balance.");
		}
		else {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		logger.info(firstName + " " +  lastName + " " + "your balance is: " + balance);
		return balance;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public byte[] getPinHash() {
		return pinHash;
	}
	
}

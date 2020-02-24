package JavaBankApplication;

// ************************************************************************
// Account.java	  Template created on15.9.2016
// - The class for Account objects
// ************************************************************************
public class Account {
	// Fields
	private String accountNumber;
	private double balance;
	// Constructor
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean withdraw(double amount) {
		
		if (balance > 0 && amount <= balance) {
			System.out.println("Withdrawal completed successfully!");
			this.balance = balance - amount;
			return true;
		} else {
			System.out.println("\nWithdrawal not completed. Available balance is too low.");
			return false;
		}
	}

	// Methods

}
// End
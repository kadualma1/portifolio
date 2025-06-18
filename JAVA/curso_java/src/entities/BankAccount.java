package entities;

public class BankAccount {

	//VARIABLES
	private final int accountNumber;
	private String accountHolder;
	private double balance;
	
	//CONSTRUCTORS
	public BankAccount(String accountHolder, int accountNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public BankAccount(String accountHolder, int accountNumber, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	//GETTERS
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	//SETTERS
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	//METHODS/FUNCTIONS
	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw (double amount) {
		this.balance -= amount + 5.00;
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", this.accountNumber, this.accountHolder, this.balance);
	}
	
	
}

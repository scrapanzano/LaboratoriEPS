package it.unibs.eps.lab1.es2;

public class BankAccount {

	private static final String DESCRIPTION = "Account n°: %d, balance: %.2f€";
	private static int accCounter = 0;
	private double balance;
	private int accNumber;
	
	public BankAccount() {
		this.balance = 0;
		this.accCounter++;
		this.accNumber = this.accCounter;
	}
	
	
	public boolean deposit(double amount) {
		if(amount <= 0)
			return false;
		
		this.balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= 0 || amount > this.balance)
			return false;
		
		this.balance -= amount;
		return true;
	}
	
	public boolean addInterest(double amount) {
		if(amount <= 0)
			return false;
		
		this.balance += this.balance/amount;
		
		return true;
	}
	
	@Override
	public String toString() {	
		return String.format(DESCRIPTION, this.accNumber, this.balance);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accNumber;
	}
}

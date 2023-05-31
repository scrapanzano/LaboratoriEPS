package it.unibs.eps.lab2.es6;

public class TimeDepositAccount extends SavingsAccount{

	private static final int EARLY_WITHDRAWAL_PENALITY = 20;
	private int monthsLeft;
	
	public TimeDepositAccount(double rate, int months) {
		super(rate);
		monthsLeft = months;
	}
	
	public TimeDepositAccount(double balance, double rate, int months) {
		super(balance, rate);
		monthsLeft = months;
	}
	
	
	// ------- metodi superclasse sovrascritti --------
	
	@Override
	public void addInterest() {
		super.addInterest();
		monthsLeft--;
	}
	
	@Override
	public void withdraw(double amount) {
		if (monthsLeft > 0)
			super.withdraw(EARLY_WITHDRAWAL_PENALITY); 
		
		super.withdraw(amount);
	}
	
	
	// ------- metodi di accesso --------
	public int getMonthsLeft() {
		return monthsLeft;
	}
	
	// ------ metodi di Object sovrascritti ---------
	
	@Override
	public String toString() {
		return super.toString() + String.format(" monthsLeft = %d", monthsLeft);
	}
	
	@Override
	public boolean equals(Object otherObject) {
		return super.equals(otherObject) && monthsLeft == ((TimeDepositAccount) otherObject).monthsLeft;
	}
	
}

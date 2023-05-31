package it.unibs.eps.lab2.es6;

public class BankAccount
{
    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {   
        deposit(initialBalance);
    }

    public void deposit(double amount)
    {
        if (amount <= 0)
            throw new IllegalArgumentException();
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        if (amount > balance || amount <= 0)
            throw new IllegalArgumentException();
        balance = balance - amount;
    }

    public void transfer(double amount, BankAccount other)
    { 
        withdraw(amount);
        other.deposit(amount);
    }


    // ------- metodi di accesso --------

    public double getBalance()
    {   
        return balance;
    }


    // ------ metodi di Object da sovrascrivere ---------
    
    @Override
    public String toString() {
    	return getClass().getName() + String.format(" balance = %.2f", balance);
    }
    
    @Override
    public boolean equals(Object  otherObject) {
    	BankAccount otherAccount = (BankAccount) otherObject;
    	
    	return balance == otherAccount.getBalance();
    }



    // -------- campi di esemplare ---------

    private double balance;
}

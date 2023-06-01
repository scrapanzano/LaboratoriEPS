package it.unibs.eps.lab1.es2;

import java.util.Scanner;

/**
 * 
 * @author Davide Leone - 723335
 *
 */
public class BankAccountTester {

	private static final String INTEREST_FAIL = "You can't add interest with a percentage = 0.";
	private static final String INTEREST_OK = "Interests succesfully added.";
	private static final String GOODBYE = "Goodbye!";
	private static final String AMOUNT_FAIL = "You must insert an amount as a number.";
	private static final String WITHDRAW_FAIL = "You can't withdraw an amount < 0 or > balance.";
	private static final String WITHDRAW_OK = "%.2f€ has been succesfully withdrawn.";
	private static final String DEPOSIT_FAIL = "You can't deposit a value <= 0.";
	private static final String DEPOSIT_OK = "%.2f€ has been successfully deposit.";
	private static final String COMMAND_MENU = "Please insert a command on the same line: (D x), (W x), B, Q: ";
	private static final String INVALID_CHOICE = "Invalid choice.";

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		boolean done = false;
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		
		do {
		done = manageCommand(scanner, acc1);
		}
		while(!done);
		
		System.out.println(GOODBYE);
	}
	
	public static boolean manageCommand(Scanner scanner, BankAccount account) {
		boolean done = false;
		boolean acquired = false;
		String sAmount = "";
		double amount = 0;
		char choice = ' ';
		
		do {
		System.out.print(COMMAND_MENU);
		
		choice = scanner.next().toUpperCase().charAt(0);
		if(choice == 'D' || choice == 'W' || choice == 'A') {
			sAmount = scanner.next();
			//Assure to have a double number as an amount.
			try {
			amount = Double.parseDouble(sAmount);
			String waste = scanner.next();
			acquired = true;
			}
			catch(NumberFormatException e) {
				System.out.println(AMOUNT_FAIL);
			}
		}
		else if(choice == 'B' || choice == 'Q'){
			String waste = scanner.next();
			acquired = true;
		}
		else {
			System.out.println(INVALID_CHOICE);
		}
			}while(!acquired);
		
			
		
		done = performChoice(choice, amount, account);
		
		return done;
	}
	
	public static boolean performChoice(char choice, double amount, BankAccount account) {
		switch(choice) {
		case 'Q': //Quit
					return true;

		case 'D': //Deposit
				  if(account.deposit(amount)) {
					  System.out.println(String.format(DEPOSIT_OK, amount));
				  }
				  else {
					  System.out.println(DEPOSIT_FAIL);
				  }
					break;
				
				  //Withdraw
		case 'W': if(account.withdraw(amount)) {
					  System.out.println(String.format(WITHDRAW_OK, amount));
					}		  
				  else {
				 	  System.out.println(WITHDRAW_FAIL);
				    }
					break;
		
		case 'A': if(account.addInterest(amount)) {
				     System.out.println(INTEREST_OK);
					}
				  else {
					 System.out.println(INTEREST_FAIL); 
				  }
					break;
			
				  //Show balance	
		case 'B': System.out.println(account.toString());
					break;
					
				  //Invalid choice	
		default: System.out.println(INVALID_CHOICE); 
		}
		
		return false;
	}

	
	

}

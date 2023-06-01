/**
 * @author Davide Leone - 723335
 */

package it.unibs.eps.lab1.es1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//boolean done = false;
		
		String s = "";
		
		
		System.out.print("Please, insert a string: ");
		s = scanner.next();

		
		StringMagic sm = new StringMagic(s);
		
		System.out.println(String.format("String reversed is: \"%s\".", sm.reverse()));
		
		/*sm.maskVowel();
		
		System.out.println(sm.getString());*/
		
		
		char c = ' ';
		
		System.out.print("Please, insert a character: ");
		c = scanner.next().charAt(0);
		scanner.close();
		
		System.out.println(String.format("The character choosen is \"%c\".", c));
		
		
		System.out.println(String.format("Character \"%c\" repeated %d.", c, sm.freq(c)));
		
		
		

	}

}

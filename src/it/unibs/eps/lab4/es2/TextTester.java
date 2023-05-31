package it.unibs.eps.lab4.es2;

import java.util.NoSuchElementException;

public class TextTester {

	public static void main(String[] args) {
		
		Text text = new Text();
		
		text.add("Ciao");
		
		try {
			System.out.println(text.removeLast());
		}
		catch(NoSuchElementException e) {
				System.out.println("L'elenco è vuoto.");
		}
		
		try {
		System.out.println(text.removeLast());
		}
		catch(NoSuchElementException e) {
			System.out.println("L'elenco è vuoto.");
		}
		

	}

}

package it.unibs.eps.lab1.es1;

/**
 * <p>
 * This class manipulates a string given from the user.
 * Below are the functions performed by this class:
 * <ul>Reverse the string;</ul>
 * <ul>Mask all the vowels with "*";</ul>
 * <ul>Return the occurrences of a chosen character.</ul>
 * </p>
 * @author Davide Leone - 72335
 * 
 *
 */
public class StringMagic {

	private String sMagic;
	
	public StringMagic(String string) {
		this.sMagic = string;
	}
	
	/**
	 * 
	 * @return A reversed version of the string.
	 */
	public String reverse() {
		String reversed = "";
		
		for(int i = sMagic.length() - 1; i >= 0; i--) {
			reversed += sMagic.charAt(i);
		}
			
			return reversed;
		}
	
	/**
	 * <p>
	 * Masks all the vowels of the string with "*".
	 * </p>
	 */
	public void maskVowel() {
		char [] vowels = {'a', 'e', 'i', 'o', 'u'};
		String temp = "";
		boolean isVocal = false;
		int j = 0;
	
		
		for(int i = 0; i < this.sMagic.length(); i++) {
			while(isVocal == false && j < 5) {
				if(this.sMagic.charAt(i) == vowels[j]) {
					temp += "*";
					j = 0;
					isVocal = true;
				}
				else {
					j++;
				}
				
			}
			if(!isVocal) {
				temp += this.sMagic.charAt(i);
				j = 0;
			}
			isVocal = false;
		}
		
		this.sMagic = temp;
	}
	
	/**
	 * @param c which is a given character choose by the user.
	 * @return the number of occurrences of a chosen character.
	 */
	public int freq(char c) {
		int count = 0;
		for(int i = 0; i < this.sMagic.length(); i++) {
			if(this.sMagic.charAt(i) == c)
				count++;
		}
		
		return count;
	}
	
	public String getString() {
		return this.sMagic;
	}
		
}

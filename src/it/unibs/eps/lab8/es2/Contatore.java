package it.unibs.eps.lab8.es2;

public class Contatore {

	private static final int VALORE_INIZIALE = 0;
	
	private int c =  VALORE_INIZIALE;

	public synchronized void incrementa() {
		c++;
	}
	
	public synchronized void decrementa() {
		c--;
	}
	
	public synchronized int getC() {
		return c;
	}
	
}

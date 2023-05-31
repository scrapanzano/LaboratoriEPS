package it.unibs.eps.lab3.es1;

public abstract class Frutta {

	private final double peso;

	public Frutta(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
}

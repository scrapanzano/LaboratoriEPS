package it.unibs.eps.lab4.es5;

public class Quadrato extends Rettangolo {

	public Quadrato(int a) {
		super(a, a);
	}
	
	@Override
	public String toString() {
		return String.format("[Q] %d", getA());
	}
}

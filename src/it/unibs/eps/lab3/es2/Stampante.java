package it.unibs.eps.lab3.es2;

public class Stampante<T extends Tecnologia> {

	private T stampante;
	
	public Stampante(T stampante) {
		this.stampante = stampante;
	}
	
	public void stampa() {
		stampante.stampa();
	}
	
}

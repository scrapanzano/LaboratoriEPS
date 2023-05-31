package it.unibs.eps.lab3.es2;

public class Test {

	public static void main(String[] args) {
		
		Stampante<Inkjet> stampante = new Stampante<Inkjet>(new Inkjet());
		stampante.stampa();

		Stampante<Laser> stampante2 = new Stampante<Laser>(new Laser());
		stampante2.stampa();
		
	}

}

package it.unibs.eps.lab8.es1;

public class Main {

	public static void main(String[] args) {
		
		Thread t1 = new PingPong("1");
		Thread t2 = new PingPong("2");
		Thread t3 = new PingPong("3");
		
		t1.start();
		t2.start();
		t3.start();
		
		//Dopo ripetute esecuzioni del test ho notato che quest'ultimo non è deterministico,
		//in quanto le stampe possono avvenire in qualsiasi ordine, non seguendo quello di start dei thread.
		

	}

}

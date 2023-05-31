package it.unibs.eps.lab8.es3;

public class Martibok {

	public static void main(String[] args) {
		Cassetta cassetta = new Cassetta();
		
		Postino p1 = new Postino("Soufiane", cassetta);
//		Postino p2 = new Postino("Edoardo", cassetta);
		Robot r = new Robot("Lorenzo", cassetta);
		
		p1.start();
//		p2.start();
		r.start();
	}

}

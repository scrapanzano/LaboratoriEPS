package it.unibs.eps.lab8.es2;

public class CompetingProc extends Thread {

	private Contatore r;
	private int T;
	private int num;
	
	public CompetingProc(Contatore r, int T, int num) {
		this.r = r;
		this.T = T;
		this.num = num;
	}

	@Override
	public void run() {
		while(T == 1) {
			r.incrementa();
			System.out.println("Thread " + num + " c = " + r.getC());
		}
		
		while(T == 0) {
			r.decrementa();
			System.out.println("Thread " + num + " c = " + r.getC());
		}
	}
	
	
	
}

package it.unibs.eps.lab8.es3;

import java.util.Stack;

public class Cassetta {

	private Stack<Lettera> cassetta;
	
	public Cassetta () {
		this.cassetta = new Stack<Lettera>();
	}
	
	public synchronized void deposita(Lettera lettera) {
		this.cassetta.push(lettera);
		notifyAll();
	}
	
	public synchronized int preleva () {
		if(this.cassetta.size() == 0)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		return this.cassetta.pop().getCodice();
	}
	
}

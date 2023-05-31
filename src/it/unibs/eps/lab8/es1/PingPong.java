package it.unibs.eps.lab8.es1;

public class PingPong extends Thread {

	private String messaggio;

	public PingPong(String messaggio) {
		this.messaggio = messaggio;
	}
	
	@Override
	public void run() {
		System.out.println(messaggio);
	}
	
	
	
}

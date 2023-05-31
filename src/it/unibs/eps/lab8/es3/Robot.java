package it.unibs.eps.lab8.es3;

public class Robot extends Thread {

	private String nome;
	private Cassetta cassetta;
	
	public Robot (String nome, Cassetta cassetta) {
		this.nome = nome;
		this.cassetta = cassetta;
	}

	@Override
	public void run() {
		System.out.println("Thread Robot " + nome);
		while(true) {
			int codice = cassetta.preleva();
			System.out.println("Thread Robot " + nome + " prelevato messaggio " + codice);
		}
	}
	
	
	
}

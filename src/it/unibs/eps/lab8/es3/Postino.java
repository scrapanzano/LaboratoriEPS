package it.unibs.eps.lab8.es3;

import java.util.Random;

public class Postino extends Thread {

	private String nome;
	private Cassetta cassetta;
	
	public Postino (String nome, Cassetta cassetta) {
		this.nome = nome;
		this.cassetta = cassetta;
	}

	@Override
	public void run() {
		System.out.println("Thread Postino " + nome);
		while(true) {
			synchronized (cassetta) {
			int dado = (int) (Math.random() * 10 + 1);
			for(int i = 1; i <= dado; i++) {
				try {
					cassetta.deposita(new Lettera(i));
					System.out.println("Thread Postino " + nome + " depositato messaggio " + i);
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
			try {
				long tempo = (long) (Math.random() * (5000 - 3000)) + 3000;
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
	
	
}

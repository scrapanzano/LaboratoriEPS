package it.unibs.eps.lab8.es2;

import java.util.Random;

public class TestMutex {

	public static void main(String[] args) {
		
		Contatore c = new Contatore();
		CompetingProc [] array = new CompetingProc [30];
		Random rand = new Random();
		
		for(int i = 0; i < 30; i++) {
			int T = rand.nextInt() % 2;
			array[i] = new CompetingProc(c, T, i);
		}
		
		for(int i = 0; i < 30; i++) {
			array[i].start();
		}

	}

}

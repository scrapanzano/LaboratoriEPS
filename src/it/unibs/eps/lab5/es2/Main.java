package it.unibs.eps.lab5.es2;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		MyFirstGui g = new MyFirstGui("My first GUI");
		
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setVisible(true);

	}

}

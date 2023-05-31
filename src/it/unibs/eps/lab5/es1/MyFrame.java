package it.unibs.eps.lab5.es1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

	private JButton startButton;
	private JButton closeButton;
	private BouncingBall ball;
	private Thread t;
	private boolean pressed = false;

	public MyFrame(String s) {
		super(s);
		
		//Imposta dimensione finestra
		setSize(400, 400);
		//Imposta layout finestra
		setLayout(new BorderLayout());
		
		//Creazione due bottoni
		startButton = new JButton("Start");
		closeButton = new JButton("Close");
			
		//Creazione bouncing ball
		ball = new BouncingBall();
		
		//Imposta colori dei due bottoni
		startButton.setBackground(Color.green);
		closeButton.setBackground(Color.red);
		
		//Aggiunge i due bottoni in una posizione all'interno della finestra
		add(startButton, BorderLayout.NORTH);
		add(closeButton, BorderLayout.SOUTH);
		
		//Aggiunge la bouncing ball in una posizione all'interno della finestra
		add(ball, BorderLayout.CENTER);
		
		//Creazione thread
		t = new Thread(ball);
		
		//Aggiunta listener al pulsante Start
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pulsante Start premuto.");
				if(!pressed) {
					t.start();
					pressed = true;
				}
				
			}	
		});
		
		//Aggiunta listener al pulsante Close
		closeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pulsante Close premuto.");
				t.interrupt();
				System.exit(0);
				
			}	
		});
		
		
	}
	
	
	
	
}

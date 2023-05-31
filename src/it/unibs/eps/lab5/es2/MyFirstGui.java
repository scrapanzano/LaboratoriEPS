package it.unibs.eps.lab5.es2;

/*
 * La finestra contiene una casella di testo , un panel e tre pulsanti 


 * con le seguenti caption "Premimi!", "A" e "B". 
 * Quando in esecuzione, l'utente può scrivere nella casella di testo.  
 * Se l'utente clicca sul pulsante "Premimi!" il testo inserito nella casella 
 * di testo viene riportato nel panel, mentre se l'utente preme gli altri 
 * due tasti l'effetto è quello di inserire nel panel la caption del tasto premuto.*/

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstGui extends JFrame {
	

	public MyFirstGui(String s) {
		super(s);
		
		//Imposta dimensione frame
		setSize(400, 400);
		
		//Imposta layout frame
		setLayout(new GridLayout(2,3,10,5));
		
		//Creazione pulsanti
		JButton bP = new JButton("Premimi!");
		JButton bA = new JButton("A");
		JButton bB = new JButton("B");
				
		//Imposta colori pulsanti
		bP.setBackground(Color.green);
		bA.setBackground(Color.cyan);
		bB.setBackground(Color.yellow);
				
				
		//Aggiunta pulsanti al pannello superiore
		add(bP);
		add(bA);
		add(bB);
		
		//Creazione campo di testo
		JTextField textField = new JTextField();
		
		//Aggiunta campo di testo al pannello inferiore
		add(textField);
		
		//Creazione area di testo
		JLabel label = new JLabel();
			
		//Aggiunta pannelli al frame
		add(label);
	
		
		//Aggiunto listener al pulsante Premimi!
		bP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	
				String text = textField.getText();
				
				if(!text.equals(""))
					label.setText(text + "\n");;
					
				
				textField.setText("");
			}
			
		});
		
		//Aggiunto listener al pulsante A
		bA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("A\n");
			}
			
		});
		
		//Aggiunto listener al pulsante B
		bB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("B\n");
			}
			
		});
		
	}
	
}

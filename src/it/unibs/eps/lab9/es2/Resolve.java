package it.unibs.eps.lab9.es2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Resolve {

	private static final String MSG_INPUT = "Inserisci il nome del file in cui sono contenuti i nomi simbolici: ";

	public static void main(String[] args) {
		//Creazione esecutore per un pool di Thread
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		//Creazione lista per contenere gli oggetti di tipo Future
		ArrayList<Future<InetAddress>> list = new ArrayList<>();
		
		System.out.print(MSG_INPUT);
		
		Scanner inputUtente = new Scanner(System.in);
		String filePath = inputUtente.next();
		
		filePath = "files\\" + filePath + ".txt";
		
		FileReader file;
		
		try {
			file = new FileReader(filePath);
			Scanner in = new Scanner(file);
			
			while(in.hasNext()) {
				Scanner lineScan = new Scanner(in.nextLine());
				String host = lineScan.next();
				
				//Creazione istanza Task
				Callable<InetAddress> task = new Task(host);
				
				//Creazione oggetto Future con esecuzione asincrona del pool di Thread
				Future<InetAddress> future = executor.submit(task);
				
				//Aggiunta oggetto alla lista
				list.add(future);
				
				//Stampa indirizzi ip
				for(Future<InetAddress> fut : list) {
					try {
						InetAddress ip = fut.get();
						
						if(ip != null)
							System.out.println(ip);
					} 
					catch (InterruptedException | ExecutionException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

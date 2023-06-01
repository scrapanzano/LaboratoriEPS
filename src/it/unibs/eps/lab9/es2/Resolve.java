package it.unibs.eps.lab9.es2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Resolve {

	private static final String MSG_INPUT = "Inserisci il nome del file in cui sono contenuti i nomi simbolici: ";

	public static void main(String[] args) {
		System.out.print(MSG_INPUT);
		Scanner inputUtente = new Scanner(System.in);
		String filePath = inputUtente.next();
		
		filePath = "files\\" + filePath + ".txt";
		
		List<String> hostNames = getHostNamesFromFile(filePath);
		
		//Crea un esecutore con un numero di thread pari al numeri di nomi a dominio
		ExecutorService executor = Executors.newFixedThreadPool(hostNames.size());
		
		ArrayList<Future<InetAddress>> list = new ArrayList<>();
		
		//Assegna un task ad ogni thread nel pool
		for(String hostName : hostNames) {
			//Creazione istanza Task
			Callable<InetAddress> task = new Task(hostName);
			
			//Creazione oggetto Future con esecuzione asincrona del pool di Thread
			Future<InetAddress> future = executor.submit(task);
			
			//Aggiunta oggetto alla lista
			list.add(future);
		}
		
		//Chiudo il pool di thread
		executor.shutdown();
		
		//Stampa indirizzi ip
		for(Future<InetAddress> fut : list) {
			try {
				InetAddress address = fut.get();
				
				if(address != null)
					System.out.println("Indirizzo IP: " + address.getHostAddress());
			} 
			catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static List<String> getHostNamesFromFile(String filePath) {
		List<String> hostNames = new ArrayList<>();
		
		try {
			FileReader file = new FileReader(filePath);
			Scanner lineScan = new Scanner(file);
			
			while(lineScan.hasNextLine()) {
				Scanner in = new Scanner(lineScan.nextLine());
				String hostName = in.next().trim();
				hostNames.add(hostName);
			}
			
			lineScan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return hostNames;
	}

}

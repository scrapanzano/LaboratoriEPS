package it.unibs.eps.lab9.es2;

import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.concurrent.Callable;

public class Task implements Callable<InetAddress> {

	private String host;
	
	public Task (String host) {
		this.host = host;
	}
	
	@Override
	public InetAddress call() {
		try {
			return InetAddress.getByName(host);
		} 
		catch (java.net.UnknownHostException e) {
				System.err.println("L'indirizzo ip dell'host " + "\"" + host + "\"" + " è ignoto.");
				return null;
		}
	}

	
	
}

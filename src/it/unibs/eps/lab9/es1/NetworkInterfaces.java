package it.unibs.eps.lab9.es1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaces {

	public static void main(String[] args) throws SocketException {
		
		Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
		
		while(interfaces.hasMoreElements()) {
			NetworkInterface iFace = interfaces.nextElement();
			
			System.out.println("Interfaccia: " + iFace.getName());
			System.out.println("Display name: " + iFace.getDisplayName());
			
			Enumeration<InetAddress> addresses = iFace.getInetAddresses();
			
			while(addresses.hasMoreElements()) {
				InetAddress iAddr = addresses.nextElement();
				
				String ip = iAddr.getHostAddress();
				
				System.out.println("Indirizzo ip: " + iFace.getDisplayName() + " " + ip);
			}
			
			System.out.println();	
		}
		
	}

}

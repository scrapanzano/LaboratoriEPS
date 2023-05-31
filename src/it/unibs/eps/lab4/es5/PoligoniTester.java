package it.unibs.eps.lab4.es5;

import java.util.*;
import java.io.*;



public class PoligoniTester {

	private static final String LETTURA_DATI = "Lettura dati in corso..";
	private static final String FILE_PATH = "files\\poligoni.txt";

	public static void main(String[] args) throws IOException{
		
		
			FileReader file = new FileReader(FILE_PATH);
			Scanner in = new Scanner(file);
			System.out.println(LETTURA_DATI);
			
		
			while(in.hasNextLine()) {
					
			try {
				Scanner linescan = new Scanner(in.nextLine());
				String ptype = linescan.next();
				if(ptype.equals("[T]")) {
					Triangolo t = new Triangolo(Integer.parseInt(linescan.next()), 
									            Integer.parseInt(linescan.next()), 
									            Integer.parseInt(linescan.next()));
					
					System.out.println(t.toString());
				}
			}
			catch (NoSuchElementException e) {
				System.err.println(e.getMessage());
			}
			catch (NumberFormatException e) {
				System.err.println(e.getMessage());
			}	
			}

}
}

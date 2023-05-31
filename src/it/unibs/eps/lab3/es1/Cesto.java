package it.unibs.eps.lab3.es1;

import java.util.ArrayList;
import java.util.List;

//Va bene E extends Frutta nella dichiarazione della classe?
public class Cesto<E extends Frutta> {

	private static final double MAX_TOTAL_WEIGHT = 5.0;
	
	private List<E> list;
	
	public Cesto() {
		this.list = new ArrayList<E>();
	}
	
	public void aggiungi(E e) throws ExceedWeightException {

		if(this.getPeso() + e.getPeso() > MAX_TOTAL_WEIGHT)
			throw new ExceedWeightException();
		
		list.add(e);
	}
	
	public double getPeso() {
		double pesoTotale = 0;
		
		for(E e : list) {
			pesoTotale += e.getPeso();
		}
		
		return pesoTotale;
	}
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		
		for(E e : list) {
			b.append(String.format("%s%n", e.toString()));
		}
		
		return b.toString();
	}
	
	
}

package it.unibs.eps.lab3.es5;

public class Coppia<T extends Comparable<T>> extends CoppiaMista<T, T>{

	public Coppia (T primo, T secondo) {
		super(primo, secondo);
	}
	
	public void inverti() {
		T temp = getPrimo();
		setPrimo(getSecondo());
		setSecondo(temp);
	}
	
	public T minore() {
		
		if(getPrimo().compareTo(getSecondo()) >= 0)
			return getSecondo();
		else
			return this.getPrimo();
		
	}
	
}

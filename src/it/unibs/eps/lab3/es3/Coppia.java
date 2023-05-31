package it.unibs.eps.lab3.es3;

public class Coppia<T extends Comparable<T>> {

	private T primo;
	private T secondo;
	
	public Coppia(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	
	public void inverti() {
		T temp = this.primo;
		this.primo = this.secondo;
		this.secondo = temp;
	}
	
	public T minore() {
		
		if(this.primo.compareTo(this.secondo) >= 0)
			return this.getSecondo();
		else
			return this.getPrimo();
		
	}
	
	@Override
	public String toString() {
		return String.format("Primo: %s%nSecondo: %s", this.primo.toString(), this.secondo.toString());
	}
	
	public T getPrimo() {
		return this.primo;
	}
	
	public T getSecondo() {
		return this.secondo;
	}
	
}

package it.unibs.eps.lab3.es5;

public class CoppiaMista<A, B> {

	private A primo;
	private B secondo;
	
	public CoppiaMista(A primo, B secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	public A getPrimo() {
		return this.primo;
	}
	
	public B getSecondo() {
		return this.secondo;
	}
	
	public void setPrimo(A newPrimo) {
		this.primo = newPrimo;
	}
	
	public void setSecondo(B newSecondo) {
		this.secondo = newSecondo;
	}
	
	public boolean checkOmogenei() {
		return(this.primo.getClass() == this.secondo.getClass());
	}
	
	@Override
	public String toString() {
		return String.format("Primo: %s%nSecondo: %s", this.primo.toString(), this.secondo.toString());
	}
}

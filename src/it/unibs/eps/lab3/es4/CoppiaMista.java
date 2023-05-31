package it.unibs.eps.lab3.es4;

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
	
	public boolean checkOmogenei() {
		return(this.primo.getClass() == this.secondo.getClass());
	}
	
	
}

package it.unibs.eps.lab4.es5;

public class Triangolo implements Poligono {

	private int a;
	private int b;
	private int c;
	
	//TODO controllo ordinato dei lati e verifica condizione
	public Triangolo(int a, int b, int c) throws IllegalArgumentException{
		int temp = 0;
		
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		if(a > b) {
			temp = b;
			b = a;
			a = temp;
		}
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		//Mi assicuro di star costruendo un triangolo
		if(c > a + b)
			throw new IllegalArgumentException();
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public int perimetro() {
		return this.a + this.b + this.c;
	}

	//TODO formula di Erone
	@Override
	public double area() {
		double p = this.perimetro()/2;
		return Math.sqrt(p*(p-this.a)*(p-this.b)*(p*this.c));
	}

	
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Poligono))	
			throw new ClassCastException();
		
		Poligono other = (Poligono) o;
		
		if(this.area() > other.area())
			return 1;
		else if(this.area() < other.area())
			return -1;
			
		return 0;
	}
	
	
	@Override
	public String toString() {
		return String.format("[T] %d %d %d", this.a, this.b, this.c);
	}
	
}

package it.unibs.eps.lab4.es5;

public class Rettangolo implements Poligono {

	private int a;
	private int b;
	
	public Rettangolo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int perimetro() {
		return (this.a + this.b) * 2;
	}

	@Override
	public double area() {
		return (this.a * this.b);
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
		return String.format("[R] %d %d", this.a, this.b);
	}
	
	public int getA() {
		return this.a;
	}
}

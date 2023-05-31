package it.unibs.eps.lab2.es7;

import java.awt.Rectangle;

public class Square extends Rectangle{

	public Square (int x, int y, int w) {
		super();
		
		setLocation(x - w / 2, y - w /2);
		
		setSize(w);
	}	
	
	
	@Override
	public void setSize(int w, int h) {
		if(w != h)
			throw new IllegalArgumentException();
		
		setSize(w);
	}
	
	public void setSize(int dim) {
		super.setSize(dim, dim);
	}
	
	
	public double getArea() {
		return getWidth() * getWidth();
	}
}

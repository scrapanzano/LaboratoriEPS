package it.unibs.eps.lab4.es6;

public class ArrayStack implements Stack {

	private Object [] array;	
	public ArrayStack() {
		this.array = new Object[10];
	}
	
	@Override
	public boolean isEmpty() {
		return this.array.length == 0 ? true : false;
	}

	@Override
	public void makeEmpty() {
		for(int i = 0; i < this.array.length; i++)
			pop();
	}

	@Override
	public void push(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object top() {
		return this.array.length != 0 ? this.array[0] : null;
	}

}

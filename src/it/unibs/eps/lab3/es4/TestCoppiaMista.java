package it.unibs.eps.lab3.es4;

public class TestCoppiaMista {

	public static void main(String[] args) {
		
		CoppiaMista<Integer, Integer> coppiaMista = new CoppiaMista<>(1, 2);
		System.out.println(coppiaMista.checkOmogenei());
		
		CoppiaMista<String, Integer> coppiaMista2 = new CoppiaMista<>("Ciao", 2);
		System.out.println(coppiaMista2.checkOmogenei());
	}

}

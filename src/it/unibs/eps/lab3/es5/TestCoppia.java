package it.unibs.eps.lab3.es5;

public class TestCoppia {

	public static void main(String[] args) {
		
		CoppiaMista<Integer, String> coppiaMista = new CoppiaMista<>(1,"Ciao");
		System.out.println(coppiaMista.checkOmogenei());
		System.out.println(coppiaMista.toString());

		Coppia<Integer> coppia = new Coppia<>(1, 2);
		System.out.println(coppia.toString());
		coppia.inverti();
		System.out.println(coppia.toString());
		System.out.println(coppia.minore());
		
		
	}

}

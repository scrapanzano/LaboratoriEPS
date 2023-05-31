package it.unibs.eps.lab3.es3;

public class TestCoppia {

	private static final String MSG_UGUALI = "I due elementi coincidono.";
	private static final String MSG_MINORE = "Il minore tra i due elementi è: ";

	public static void main(String[] args) {
		
		Coppia<Integer> coppia = new Coppia<Integer>(1, 2);
		
		System.out.println(coppia.toString());
		
		coppia.inverti();
		
		System.out.println(coppia.toString());
		
		if(coppia.minore() != null)
			System.out.println(MSG_MINORE + coppia.minore());
		else
			System.out.println(MSG_UGUALI);
		
	}

}

package it.unibs.eps.lab3.es1;

public class TestFrutta {

	private static final String MSG_FRUTTO_AGGIUNTO = "Frutto aggiunto.";

	public static void main(String[] args) {
		
		Cesto<Mela> cesto = new Cesto<Mela>();
		
		for(int i = 0; i < 5; i++) {
		try {
			cesto.aggiungi(new Mela(2));
				System.out.println(MSG_FRUTTO_AGGIUNTO);
		} catch (ExceedWeightException e) {
			System.out.println(e.getMessage());
		}
		}
		
		System.out.println(cesto.getPeso());
		
	}
}

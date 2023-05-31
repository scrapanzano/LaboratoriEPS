package it.unibs.eps.lab3.es1;

public class ExceedWeightException extends Exception {

	private static final String MSG_ERROR = "Il peso supera il limite consentito.";

	public ExceedWeightException() {
		super(MSG_ERROR);
	}
	
}

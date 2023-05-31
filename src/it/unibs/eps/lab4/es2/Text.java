package it.unibs.eps.lab4.es2;


import java.util.NoSuchElementException;

import it.unibs.eps.lab4.es1.*;

public class Text implements Container
{
    /*
        costruisce un contenitore di testo vuoto
    */
	private Comparable [] stringhe;
	
    public Text() { 
    	this.stringhe = new String [0];
    } 

 
  
    //restituisce il numero di elementi presenti nel contenitore
    public int size() { 
    	return this.stringhe.length;
    } //completare

    /*
        aggiunge la parola aWord in coda all'elenco
        se l'elenco e' pieno, ridimensiona l'elenco.
    */
    public void add(String aWord)
    { 
    	this.stringhe = ArrayAlgs.resize(this.stringhe, this.stringhe.length + 1);
    	this.stringhe[this.stringhe.length - 1] = aWord;
 
    } //completare

    /*
        ordina per fusione l'elenco delle parole.
    */
    public void sort()
    { 
    	ArrayAlgs.mergeSort(this.stringhe, this.stringhe.length);
    } 

    /*
        restituisce l'ultima parola dell'elenco, rimuovendola
        Lancia NoSuchElementException se l'elenco e' vuoto
    */
    public String removeLast() throws NoSuchElementException
    { 
    	if(this.stringhe.length == 0)
    		throw new NoSuchElementException();
    	
    	Comparable last = this.stringhe[this.stringhe.length - 1];
    	this.stringhe = ArrayAlgs.resize(this.stringhe, this.stringhe.length - 1);
    	
    	return (String)last;
    }

	@Override
	public boolean isEmpty() {
		if(this.size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void makeEmpty() {
		this.stringhe = new String [0];
		
	} 

}
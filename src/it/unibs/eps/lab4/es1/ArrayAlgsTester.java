package it.unibs.eps.lab4.es1;

import java.util.Scanner;

public class ArrayAlgsTester {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\n---- collaudo di selectionSort ----");
        String[] a = inputArray(in);        
        System.out.println("Creato:\n"+ArrayAlgs.printArray(a,a.length));
        ArrayAlgs.selectionSort(a,a.length);
        System.out.println("Ordinato:\n"+ArrayAlgs.printArray(a,a.length));

        System.out.println("\n---- collaudo di mergeSort ----");
        a = inputArray(in);     
        System.out.println("Creato:\n" + ArrayAlgs.printArray(a,a.length));
        ArrayAlgs.mergeSort(a,a.length);
        System.out.println("Ordinato:\n"+ArrayAlgs.printArray(a,a.length));

        System.out.println("\n---- collaudo di insertionSort ----");
        a = inputArray(in);     
        System.out.println("Creato:\n" + ArrayAlgs.printArray(a,a.length));
        ArrayAlgs.insertionSort(a,a.length);
        System.out.println("Ordinato:\n"+ArrayAlgs.printArray(a,a.length));

        System.out.println("\n---- collaudo di linearSearch ----");
        inputSearch(in, a, false);

        System.out.println("\n---- collaudo di binSearch ----");
        inputSearch(in, a, true);
    }

    //metodo ausiliario per la gestione dell'input e creazione dell'array
    private static String[] inputArray(Scanner in)
    {   System.out.println("Lunghezza dell'array?");
        int l = Integer.parseInt(in.nextLine());
        System.out.println("Massima lunghezza di una stringa dell'array?");
        int n = Integer.parseInt(in.nextLine());
        String[] a = randomStringArray(l,n);
        return a;
    }

    //metodo ausiliario per la gestione dell'input e ricerca nell'array
    //binsearch e` un flag per decidere se usare linearSearch o binarySearch
    private static void inputSearch(Scanner in, String[] a, boolean binsearch)
    {   boolean done = false;
        while (!done)
        {   System.out.println("Stringa da cercare (Q per uscire)? ");
            String value = in.nextLine();
            if (value.equals("Q"))
                done = true;
            else
            {   int index = -1;
                if (binsearch)
                    index = ArrayAlgs.binarySearch(a, a.length, value);
                else
                    index = ArrayAlgs.linearSearch(a, a.length, value);
                System.out.println("Array:\n"+ArrayAlgs.printArray(a,a.length));
                if (index >=0)
                    System.out.println("Stringa trovata in elemento " + index);
                else System.out.println("Stringa non trovata");
            }
        }
    }

    //metodo che genera un array di l stringhe, ciascuna delle quali
    //contiene caratteri casuali ed e` lunga almeno 1 e al piu` n
    private static String[] randomStringArray(int l, int n)
    {   String[] v = new String[l];
        for (int i=0; i<l; i++)
        {   String s = "";
            int lstring = (int) (1 + n * Math.random()); 
            for (int j=0; j<lstring; j++)
                //Cosa sono 97 e 122? Andarsi a ripassare la codifica Unicode...
                s = s + (char) (97 +(1+122-97)* Math.random());
            v[i] = s;
        }
        return v;
    }
}

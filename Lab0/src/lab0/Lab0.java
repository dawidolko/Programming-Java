package lab0;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Lab0 {

    /**
     * @param args the command line arguments
     */

    // komentarz linoowy
    /*komentarz blokowy*/
    public static void main(String[] args) { //punkt startowy programu /public oznacza ze jest widoczna we wszystkich czesciach programu
       System.out.println("Hello world"); //String[] oznacza ze main jest zapisana jako tekst programu
       System.out.println("Podaj imie: ");
       Scanner abc = new Scanner(System.in); //stworzenie nowego obiektu o typie Scanner (KONSTRUKTOR)
       String name = abc.nextLine(); // new rezerwuje pamiec miejsce na stercie // abc redenduje (NAZWA)
       System.out.println("Twoje imie to: " + name+"!!!"); // kontagenacja (+name) <--

       System.out.println("Ile masz lat?");

       int old = abc.nextInt();
       System.out.println("Twoj wiek to: " + old+"!!!");
        // TODO code application logic here
    }
}

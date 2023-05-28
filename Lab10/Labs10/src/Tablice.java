public class Tablice {
    public static void main(String[] args) {
        int[] a;
        String[] słowa;
//        słowa = new String [4] ;
//        x = new int [n + 20] ; // rozmiar określony przy pomocy wyrażenia
        int[] pierwsze = {1, 2, 3, 4 + 1, 7, 11};
        String[] muszkieterzy = {"Atos", "Portos", "Aramis"};
        Punkt[] trojkat = { new Punkt(0,0), new Punkt(3,0), new Punkt(3,4) };
 //ostatni przecinek jest opcjonalny
 //dlatego został wcześniej pominięty
        int [] liczby3 = new int[13];
        for(int i = 0; i < 8; i++)
            liczby3[i] = i * 3;
        int [] tab = {24, 27, 30, 33, 36}; // tworzymy drugą tablicę
        for(int k=0; k < 5; k++ ) // kopiujemy liczby 24, 27, 30, 33, 36
            liczby3[8 + k] = tab[k];
        System.arraycopy( tab, 0, liczby3, 8, 5 );
    }
}

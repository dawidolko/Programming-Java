package task6;

public class Liczba {
    private int[] cyfry;
    private int dlugosc;

    public Liczba(String liczba) {
        this.cyfry = new int[liczba.length()];
        this.dlugosc = liczba.length();
        for (int i = 0; i < this.dlugosc; i++) {
            this.cyfry[i] = Character.getNumericValue(liczba.charAt(i));
        }
    }

    public void wypisz() {
        for (int i = 0; i < this.dlugosc; i++) {
            System.out.print(this.cyfry[i]);
        }
        System.out.println();
    }

    public void mnozenie(int mnoznik) {
        int[] wynik = new int[this.dlugosc * 2];
        int nowaDlugosc = 0;
        int przeniesienie = 0;
        for (int i = this.dlugosc - 1; i >= 0; i--) {
            int mnozenie = this.cyfry[i] * mnoznik + przeniesienie;
            wynik[nowaDlugosc] = mnozenie % 10;
            przeniesienie = mnozenie / 10;
            nowaDlugosc++;
        }
        if (przeniesienie != 0) {
            wynik[nowaDlugosc] = przeniesienie;
            nowaDlugosc++;
        }
        this.cyfry = wynik;
        this.dlugosc = nowaDlugosc;
    }

    public int silnia(int liczba) {
        Liczba wynik = new Liczba("1");
        for (int i = 2; i <= liczba; i++) {
            wynik.mnozenie(i);
        }
        wynik.wypisz();
        return wynik.dlugosc;
    }
}
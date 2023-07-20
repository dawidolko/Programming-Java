public class Czlowiek {
    Czlowiek()
    {
        count++;
    }
    Czlowiek(String imie)
    {
        this.imie = imie;
        count++;
    }
    static int count = 0; // static poniewaz wtedy liczy ilosc uzyc inaczej bedzie zawsze 1.
    static String imie;
}

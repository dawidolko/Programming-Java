package Zwierzeta;

public class Run
{
    public void Runs()
    {
        Wieloryb w1 = new Wieloryb("Stefan", "Ryba", "Wieloryb");
        System.out.println(w1.opis());
        System.out.println(w1.jedz());
        System.out.println(w1.pij());
        System.out.println(w1.plyn());
        System.out.println(w1.wynurz());
        System.out.println(w1.zanurz());
        System.out.println(w1.spowalniaj());
        System.out.println(w1.wydal());

        System.out.println();

        Koliber k1 = new Koliber("Karolina", "Ptak", "Koliber");
        System.out.println(k1.opis());
        System.out.println(k1.jedz());
        System.out.println(k1.pij());
        System.out.println(k1.lec());
        System.out.println(k1.wyladuj());
        System.out.println(k1.wydal());
    }
}

public class Zwierze { // klasa zwierze
    static int count = 0;
    Zwierze(){
        count++;
    }
    String imie;
    String glos = "Grrrrr";
    public void dajGlos(int x)
    {
        for(int i = 0; i < x; i++)
        {
            System.out.print(glos);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void przedstawSie()
    {
        System.out.println("nazywam sie " + imie);
    }
}

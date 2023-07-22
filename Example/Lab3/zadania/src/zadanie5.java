// Zad. 5 Napisz program wyświetlający liczby od 20-0, z wyłączeniem liczb {2,6,9,15,19}.
//      Do realizacji zadania wyłączenia użyj instrukcji continue.

public class zadanie5
{
    public static void main(String[] args)
    {
        for(int x = 20; x >=0; x--)
        {
            if (x==2 || x==6 || x==9 || x==15 || x==19)
            {
                continue;
            }
            System.out.println("x=" + x);
        }
    }
}

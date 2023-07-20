/*#3. Kurs Java dla początkujących - Operatory arytmetyczne https://www.youtube.com/watch?v=SjPYpqWZxVY&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=4
 */
public class task3 {
    public static void main(String[] args)
    {
        int a = 20;
        int b = 10;
        int wynik = b + a;
        int wynik1 = b - a;
        int wynik2 = b * a;
        int wynik4 = a % b; // reszta z dzielenia
        double wynik3 = (double)b / (double)a; // musialbym zmiennic zmienne a i b na double poniewaz liczy on integer. Zastosowalem rzutowanie (czyli dodalem double przed a i b)
        int wynik5 = 2 + 2 * 2;
        System.out.println(wynik);
        System.out.println(wynik1);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(wynik4);
        System.out.println(wynik5);
        a+=b; a-=b; a*=b; a/=b;
        System.out.println(a);

        System.out.println(Math.pow(2, 3)); //potegowanie

        System.out.println(Math.sqrt(9)); //pierwiastek

        System.out.println(Math.abs(-50)); // wartosc bezwzgledna

        //jest liczba PI oraz E w math.PI, math.E

        // a++; postinkrementacja <--
        // a--; postdekrementacja <-- to sie robi po wypisaniu a
        // ++a;  inkrementacja <--
        // --a; dekrementacja <-- to sie robi od razu

    }
}

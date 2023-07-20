/*#5. Kurs Java dla początkujących - Instrukcje warunkowe IF https://www.youtube.com/watch?v=CnG7wcxYbwk&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=6*/
public class task5 {
    public static void main(String[] args)
    {
        if(true)
        {
            System.out.println("Prawda");
        }
        if(false)
        {
            System.out.println("Falsz");
        }
        int wiek = 16;
        if(wiek >= 18)
        {
            System.out.println("Osoba pelnoletnia");
        }
        else
        {
            if(wiek>=16) // mozna tu uzyc else if(...) to jest to samo.
            {
                System.out.println("Możesz pracować");
            }
            else
            {
                System.out.println("Nie możesz wypić piwka *LEGALNIE XD*");
            }
        }

        String imie = wiek >= 18 ? "Bartek" : "Józef";
        System.out.println(imie);
    }
}

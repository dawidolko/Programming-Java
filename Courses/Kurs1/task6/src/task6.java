/*#6. Kurs Java dla początkujących - Instrukcje Switch https://www.youtube.com/watch?v=-VvDEB8N1Uw&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=7*/
public class task6 {
    public static void main(String[] args)
    {
        int poraRoku = 10;
        // if(poraRoku == 1); <-- to jest lekcja o switch
        switch (poraRoku)
        {
            case 1: //case to przypadek po ang.
                System.out.println("wiosna");
                break; //break to łamać, wyłamać po ang.
            case 2:
                System.out.println("lato");
                break;
            case 3:
                System.out.println("jesien");
                break;
            case 4:
                System.out.println("zima");
                break;
            default:
                System.out.println("podaj wartosc od 1 - 4");
        }
    }
}

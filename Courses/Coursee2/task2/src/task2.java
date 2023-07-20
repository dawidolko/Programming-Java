import drive.HDDDrive;
import drive.ssdDrive;

/*Kurs Java - programowanie obiektowe w 3h https://www.youtube.com/watch?v=OvY0f-IWlos*/
public class task2 {
    public static void main(String[] args)
    {
        //KONSTRUKTOR PUSTY.
        Garnek garnek1 = new Garnek(); //tak przypisujemy klase Garnek do funkcji main. można napisac również new Garnek(); i dodać CTRL + ALT + V i nam sie samemu zrobi.

        garnek1.srednica = 7; // przypisujemy jakies wartosci
        garnek1.wysokosc = 5; // <--
        garnek1.kolor = "Srebny"; // <---

        System.out.println(garnek1.kolor); // wypisujemy je
        System.out.println(garnek1.srednica); // <--
        System.out.println(garnek1.wysokosc); // <--

        //KONSTRUKTOR Z ZAWARTOSCIAMI.
        Garnek garnek = new Garnek(7, 5, "Srebny");
        System.out.println(garnek.kolor); // wypisujemy je
        System.out.println(garnek.srednica); // <--
        System.out.println(garnek.wysokosc); // <--

        String wiadomosc = garnek.gotuj(); //przypisanie metody do zmiennej String wiadomosc i wypisanie jej.
        System.out.println(wiadomosc);

        String wiadomosc2 = garnek.gotuj(true); //tu jest zastosowanie funkcji boolean poniewaz jako argument podalismy "true" jesli by tam nic nie bylo nadal bylaby metoda powyższa.
        System.out.println(wiadomosc2);

        int temperatura = garnek.zwrocTempWrzeniaWody();
        System.out.println(temperatura);

        garnek.gotujBezInformacji(); // void nie trzeba przypisywać bo nic nie zwraca.
        //Motyfikatory to: public private protected final <-- Pamietaj również o tym że każda metoda powinna byc robiona dla poszczegolnych rzeczy oddzielnie.
        //Enkapsulacja/hermetyzacja jest to udzielanie dostepu tylko tam gdzie trzeba, aby zabezpieczyć się przed np. wyciekami.


        uzytkownik mariusz = new uzytkownik(20, "Mariusz");
        //mariusz.setWiek(-1); //tu bedzie exception
        mariusz.setWiek(20);
        System.out.println(mariusz.getWiek()); //wypisuje <-- bo getWiek zwraca int wieku.

        if(mariusz.czyMozeLegalnieKupicAlkohol()) // jesli prawda moze / falsz nie moze ...
        {
            System.out.println("moze kupic piwko");
        }else
        {
            System.out.println("nie moze kupic piwerka");
        }
    }

}

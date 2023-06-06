package zadanie2;
// POLECENIE:

//        Utwórz klasę abstrakcyjną Zwierze.
//
//        - Klasa posiada odpowiednie pola: nazwa: String, gatunek:String, waga: float.
//
//        - Dokonaj hermetyzacji pól pamiętając, że waga nie może być ujemna. W razie wprowadzenia wartości ujemnej ma być
//        wyrzucony wyjątek NegativeValueException.
//
//        - Klasa posiada odpowiednie konstruktory (przynajmniej dwa).
//
//        - Klasa ma dwie metody: abstrakcją WydajGlos() i zwykłą (konkretną) PokazInformacje().
//
//        Metoda PokazInformacje() powinna wyświetlać w konsoli tekst „Dane zwierzęcia:”, a następnie jego nazwa, gatunek,
//        wagę oraz wywoływać metodę WydajGlos(). (6 pkt)
//
//        B) Utwórz interfejsy z metodami abstrakcyjnymi (2 pkt):
//
//        · IPlywanie z metodą: Plywaj(int predkoscPlywania, int glebokosc);
//
//        · IBieganie z metodą: Biegnij(int predkoscBiegania);
//
//        · ILatanie z metodą: Lataj(int predkoscLatania, int wysokosc);
//
//        · IDrapieznictwo z metodą: Atakuj();
//
//        C) Utwórz klasy:
//
//        - Kaczka, Orzel, Lew, Rekin dziedziczące po klasie Zwierze i implementujące odpowiednie interfejsy (interfejsy
//        należy dopasować do każdego zwierzęcia).
//
//        - Dla każdego zwierzęcia dodaj odpowiednie pola przechowujące odpowiednie dane odnośnie prędkości biegania,
//        latania, pływania, głębokości i wysokości, w zależności od tego jakie interfejsy implementuje klasa.
//
//        - Utwórz odpowiednie konstruktory na bazie konstruktora klasy bazowej z uwzględnieniem dodanych pól.
//
//        - Przesłoń metodę WydajGlos() oraz zaimplementuj metody z przypisanych klasie interfejsów.
//
//        - Przesłoń metodę PokazInformacje() dodając w niej wyświetlanie pól dodanych w klasach Kaczka, Orzel, Lew, Rekin.
//
//        Zaimplementuj metody abstrakcyjne oddziedziczone po interfejsach tak aby wartości w nich ustawiane (odpowiednio dodane
//        pola klasy) mogły przyjmować tylko wartości dodatnie (chodzi o atrybuty: prędkość pływania i biegania, wysokość i głębokość)
//
//
//        D) (Uwaga zadanie wymagane – bez niego kolokwium będzie niezaliczone)
//
//        Utwórz klasę Main posiadającą metodę main jako punkt startowy programu. Utwórz w metodzie main obiekty zwierząt Kaczka,
//        Orzel, Lew, Rekin. Dla wszystkich obiektów wywołaj metodę PokazInformacje().
//
//        E) W klasie Main utwórz metody statyczne umożliwiające wprowadzanie danych zwierząt. Wychwyć wyjątki typu NegativeValueException
//        i obsłuż je w taki sposób, że jeżeli użytkownik poda negatywną wartość wyświetla mu się informacja o błędnie podanej wartości i rekurencyjnie wywołuje się ta metoda wprowadzająca dane, aż do skutku (aż użytkownik poda właściwą wartość, większą od zera).
//
//        F) W metodzie main utwórz dodatkowo 10-elementową tablicę przechowującą różne zwierzęta. Przejdź tablicę przy użyciu pętli i
//        wywołaj dla każdego elementu tablicy metodę PokazInformacje().

public class Main { //stworzylem package specialny "dodatekZadanie2" w ktorym wprowadza sie dane recznie i jesli wartosc jest ujemna wtedy
    // powtarza sie wpisanie az do momentu dobrej wartosci.
    public static void main(String[] args) {
        // Utworzenie obiektów zwierząt
        try {
            Kaczka kaczka = new Kaczka("Dyzio", "Kaczka krzyżówka", 1.5f, 20, 2, 50, 100);
            Orzel orzel = new Orzel("Heniek", "Orzeł przedni", 3.2f, 60, 500);
            Lew lew = new Lew("Simba", "Lew afrykański", -100, 80); //specialnie dalem wartosc na minusie i wyskoczyl blad.
            Rekin rekin = new Rekin("Tomek", "Rekin biały", 600, 40, 200);

            // Wywołanie metody PokazInformacje() dla każdego zwierzęcia
            kaczka.PokazInformacje();
            System.out.println();
            orzel.PokazInformacje();
            System.out.println();
            lew.PokazInformacje();
            System.out.println();
            rekin.PokazInformacje();
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        System.out.println();

        // Utworzenie tablicy zwierząt
        Zwierze[] zwierzeta = new Zwierze[10];
        try {
            zwierzeta[0] = new Kaczka("Donald", "Kaczka domowa", 1.2f, 15, 1, 40, 80);
            zwierzeta[1] = new Orzel("Aniol", "Orzeł królewski", 2.5f, 70, 600);
            zwierzeta[2] = new Lew("Simba", "Lew afrykański", 200, 90);
            zwierzeta[3] = new Rekin("Tazor", "Rekin żarłacz biały", 700, 35, 180);
            zwierzeta[4] = new Kaczka("Dejzi", "Kaczka domowa", 1.0f, 18, 2, 45, 90);
            zwierzeta[5] = new Orzel("Hera", "Orzeł przedni", 2.8f, 65, 550);
            zwierzeta[6] = new Lew("Simona", "Lew afrykański", 190, 75);
            zwierzeta[7] = new Rekin("Reksiu", "Rekin wielorybi", 1000, 30, 220);
            zwierzeta[8] = new Kaczka("Damian", "Kaczka krzyżówka", 1.3f, 16, 2, 42, 85);
            zwierzeta[9] = new Orzel("Czarek", "Orzeł przedni", 3.0f, 55, 480);

            // Wywołanie metody PokazInformacje() dla każdego zwierzęcia w tablicy
            for (Zwierze zwierze : zwierzeta) {
                zwierze.PokazInformacje();
                System.out.println();
            }
        } catch (NegativeValueException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}

//wynik1; (wyniki są zalezne od tego czy popdany wartosc ujemna, jesli tak to wtedy nie wyswietla sie reszta zwierząt aż do podania poprawnej
//wartosci.

//    Dane zwierzęcia:
//        Nazwa: Dyzio
//        Gatunek: Kaczka krzyżówka
//        Waga: 1.5 kg
//        Kwa kwa!
//
//        Dane zwierzęcia:
//        Nazwa: Heniek
//        Gatunek: Orzeł przedni
//        Waga: 3.2 kg
//        Skrr!
//
//        Dane zwierzęcia:
//        Nazwa: Simba
//        Gatunek: Lew afrykański
//        Waga: 180.0 kg
//        Ryczenie lwa!
//
//        Dane zwierzęcia:
//        Nazwa: Tomek
//        Gatunek: Rekin biały
//        Waga: 600.0 kg
//        Jaws music...
//
//        Dane zwierzęcia:
//        Nazwa: Donald
//        Gatunek: Kaczka domowa
//        Waga: 1.2 kg
//        Kwa kwa!
//
//        Dane zwierzęcia:
//        Nazwa: Aniol
//        Gatunek: Orzeł królewski
//        Waga: 2.5 kg
//        Skrr!
//
//        Dane zwierzęcia:
//        Nazwa: Simba
//        Gatunek: Lew afrykański
//        Waga: 200.0 kg
//        Ryczenie lwa!
//
//        Dane zwierzęcia:
//        Nazwa: Tazor
//        Gatunek: Rekin żarłacz biały
//        Waga: 700.0 kg
//        Jaws music...
//
//        Dane zwierzęcia:
//        Nazwa: Dejzi
//        Gatunek: Kaczka domowa
//        Waga: 1.0 kg
//        Kwa kwa!
//
//        Dane zwierzęcia:
//        Nazwa: Hera
//        Gatunek: Orzeł przedni
//        Waga: 2.8 kg
//        Skrr!
//
//        Dane zwierzęcia:
//        Nazwa: Simona
//        Gatunek: Lew afrykański
//        Waga: 190.0 kg
//        Ryczenie lwa!
//
//        Dane zwierzęcia:
//        Nazwa: Reksiu
//        Gatunek: Rekin wielorybi
//        Waga: 1000.0 kg
//        Jaws music...
//
//        Dane zwierzęcia:
//        Nazwa: Damian
//        Gatunek: Kaczka krzyżówka
//        Waga: 1.3 kg
//        Kwa kwa!
//
//        Dane zwierzęcia:
//        Nazwa: Czarek
//        Gatunek: Orzeł przedni
//        Waga: 3.0 kg
//        Skrr!



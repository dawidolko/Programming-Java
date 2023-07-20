/*Java - podstawy w 2h https://www.youtube.com/watch?v=6G19kFcVXTo&t=2s*/
//package pl.dawidolko;

import java.util.*;

public class Main { // JAVA TO JEZYK STATYCZNIE TYPOWANY WIEC PRZECIWNY NP. PYTHONOWI
    public static void main(String[] args) { // sygnatura metody <--
        Scanner scanner = new Scanner(System.in); // tworzenie nowej metody scanner
        System.out.println("Podaj imie: "); // to musi byc wyzej od String name, poniewaz program idzie linijka po linijce wiec wyswietliłoby sie to po wprowadzeniu imienia
        String name = scanner.nextLine(); // wczytuje z konsoli imie np."Tomek" <-- ! ! ! ZWRACA TYLKO STRING
        System.out.printf("Cześć %s\r\n", name);
        // System.out.println("Czesc " + name); // < - -  to jest to samo co wyżej

        if(!name.isEmpty() && (!name.endsWith("a") || name.equals("Kuba")))
        {
            System.out.println("prawdopodobnie jestes mężczyzną");
        } else if(!name.isEmpty() && name.endsWith("a")) // name.isEmpty sprawdza czy zmienna name jest pusta jesli jest to to bedzie fałsz. Empty = Pusty pod ang.
        {
            System.out.println("prawdopodobnie jestes kobieta");
        }else
        {
            System.out.println("imie nie moze byc puste");
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int age = scanner1.nextInt(); // to wczytuje liczby calkowite ! ! !

        if(age >= 18) {
            System.out.println("jestes pelnoletni");
        }else
        {
            System.out.println("jestes niepelnoletni");
        }
        // TYPY PRYMITYWNE to typy ktore nie mają zastosowań np. age.(tu są) INT, float, itp...
        // TYPY REFERENCYJNE to typy mające zasotsowanie do metod np. scanner1.(TU SĄ) nextInt(), endWith() itp...

        var name1 = "Kamil"; // od wersji 10 javy istnieje zmienna var ktora odgaduje typ po przez jego zawartosc.

        String firstName = "Kamil";
        String lastName = "Brzezinski";
        System.out.printf("%s %s\n\t\r", firstName, lastName);

        int a = 2;
        int b = 3;
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a / b); // tu jest liczba całkowita bo uzywany typu calkowitego.

        System.out.println(a % b); // modullo czyli reszta z dzielenia.
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);

        double c = 2.0;
        double d = 3.0;
        System.out.println(a / b); // tu jest jest dobrze.

        boolean isSkyBlue = true; // false wykona sie else

        if(isSkyBlue)
        {
            System.out.println("wyswietl napis niebo jest niebieskie");
        }else
        {
            System.out.println("wyswietl napis niebo nie jest niebieskie");
        }

        System.out.println("petla for");
        for(int i=0, j = 10; i < j; i++, j--) //preinkrementacja
        {
            System.out.println(i);
        }

        System.out.println("petla while");
        int k = 0;
        while (k < 10)
        {
            System.out.println(k);
            k++;
        }

        System.out.println("");

        for (int i=0; i<10;i++)
        {
            if(i == 4)
            {
                continue; // pomija 4 jakby bylo break; to by konczylo pracę.
            }
            System.out.println(i);
        }

        System.out.println("pierwsza apka");

        for(int i=1; i < 101; i++)
        {
            if(i % 5*3 == 0) // ta sie tez zrobic z continue;
            {
                System.out.println("fizzbuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("fizz");
            }else if(i % 5 == 0)
            {
                System.out.println("buzz");
            }else {
                System.out.println(i);
            }
        }

        System.out.println("pierwsza gra");

        Random random = new Random(); // ctrl + alt + v <-- ! ! !
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner2 = new Scanner(System.in);

        boolean wasNumberGuessed = false;
        while(!wasNumberGuessed) {
            System.out.println("Zapodaj byczku liczbe: ");
            int userNumber = scanner2.nextInt();

            if (userNumber < numberToGuess) {
                System.out.println("Liczba jest za mala");
            } else if (userNumber > numberToGuess) {
                System.out.println("liczba jest z duza");
            } else {
                System.out.println("Brawo, to jest wlaciwa liczba");
                wasNumberGuessed = true;
            }
        }
            System.out.println();
            //Tablice - skruktura
            String[] names = new String[4];

            names[0] = "Mariusz"; // WAŻNE CRTL + / zakomentowywuje zaznaczone pole. ! ! !
            names[1] = "Dominik";
            names[2] = "Kasia";
            names[3] = "Asia";

            for(int i=0;i<names.length;i++)
            {
                System.out.println(names[i]);
            }
            String[] names1 = {"Mariusz", "Dominik", "Kasia", "Asia"}; // < -- to jest o samo

            for(String name2 : names1)
            {
                System.out.println(name2); // ta petla dziala tak samo jak ta wyzej tylko bierze name1 i tworzy dla kazdego z jego elementow Stringa name2 i wypisuje go!
            } // TZW. FOREACH

            System.out.println();

            List<String> names3 = new ArrayList<>(); // tablica listy <-- ARRAYLIST
            names3.add("Mariusz");
            names3.add("Dominik");
            names3.add("Blazej");
            names3.add("Blazej");
            names3.add("Blazej"); // moga istniec duplikaty

            names3.remove("Blazej"); // usuwa pierwsze wystapienie <--

            System.out.println(names3.contains("Dominik"));

            System.out.println(names3.get(0)); // wyswietla 0 index czyli 1 element

            for (String name3 : names) { // TO JEST TZW. FOREACH
                System.out.println(name);
            }

            names3.clear(); //czysci liste
            System.out.println(names3.isEmpty()); // sprawdza czy jest pusta

            Set<String> meals = new HashSet<>(); // przekonwertowanie naszych wprowadzonych wartosci alfabetycznie, wielkowsciowo itp. // tablica listy <-- HASHSET
            meals.add("Pizza");
            meals.add("Burger");
            meals.add("Pizza"); // TU NIE MA DUPLIKATOW TAK JAK SĄ W LISCIE.
            meals.add("Salad");

            for(String meal : meals)
            {
                System.out.println(meal);
            }

            System.out.println();

            Map<String, String> nameToMeal = new HashMap<>(); // tablica listy <-- HASHMAP

            nameToMeal.put("Mariusz", "pizza");
            nameToMeal.put("Dominik", "burger");
            nameToMeal.put("Kamil", "pizza");

            nameToMeal.put("Dominik", "pasta"); // Wyświetli sie to poniewaz mapa dziala tak ze wyswietla to co jest potem. Nowa zastąpi wartosc starą

            System.out.println(nameToMeal.isEmpty());

            System.out.println(nameToMeal.get("Dominik"));

            Set<String> keys = nameToMeal.keySet();
            for(String key : keys)
            {
                System.out.println(key); // wyswietla slowa kluczowe ( W TYM PRZYPADKU IMIONA )
            }

            Collection<String> values = nameToMeal.values();
            for(String value : values)
            {
                System.out.println(value); // WYSWIETLA WARTOSCI CZYLI POTRAWY <--- w kolejnosci alfabetycznej
            }

            System.out.println(nameToMeal.containsKey("Mariusz")); // sprawdzamy czy zawiera wartosc kluczową mariusz
            System.out.println(nameToMeal.containsValue("Pizza"));// sprawdzamy czy zawiera wartosc wartosci pizza

            System.out.println("aplikacja nr. dwa");

            Scanner scanner3 = new Scanner(System.in);
            boolean shouldContinue = true;

            Party party = new Party();

            while(shouldContinue)
            {
                System.out.println("Wybierz opcje:");
                System.out.println("1. Wyswietl gosci");
                System.out.println("2. Dodaj goscia");
                System.out.println("3. Wyswietl potrawy");
                System.out.println("4. Znajdz po numerze telefonu");
                System.out.println("Wyjscie");

                int userChoice = scanner3.nextInt();

                switch (userChoice) // switch w noweej wersji od javy 13
                {
                    case 1 -> party.displayGuests();
                    case 2 -> party.addGuest();
                    case 3 -> party.displayMeals();
                    case 4 -> party.displayGuestByPhoneNumber();
                    case 5 -> shouldContinue = false;
                }
//                switch (userChoice) // switch starego typu <-- w kazdej wersji.
//                {
//                    case 1:
//                        System.out.println("wybrano 1");
//                        break;
//                    case 2:
//                        System.out.println("wybrano 2");
//                        break;
//                    case 3:
//                        System.out.println("wybrano 3");
//                        break;
//                    case 4:
//                        System.out.println("wybrano 4");
//                        break;
//                    case 5:
//                        shouldContinue = false;
//                        break;
//                }
            }
    }
}
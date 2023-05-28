package Task4;

import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        // Tworzymy slownik
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("dom", "house");
        dictionary.put("piłka", "ball");
        dictionary.put("jabłko", "apple");
        dictionary.put("drzewo", "tree");
        dictionary.put("rower", "bike");
        dictionary.put("samochód", "car");
        dictionary.put("pies", "dog");
        dictionary.put("kot", "cat");
        dictionary.put("lampa", "lamp");
        dictionary.put("stół", "table");
        dictionary.put("krzesło", "chair");
        dictionary.put("słońce", "sun");
        dictionary.put("księżyc", "moon");
        dictionary.put("drzwi", "door");
        dictionary.put("okno", "window");
        dictionary.put("szafa", "wardrobe");
        dictionary.put("łóżko", "bed");
        dictionary.put("kuchnia", "kitchen");
        dictionary.put("zegar", "clock");
        dictionary.put("klawiatura", "keyboard");
        dictionary.put("mysz", "mouse");

        // Tworzymy skaner
        Scanner scanner = new Scanner(System.in);

        // Pętla, ktora bedzie dzialac dopoki uzytkownik nie wpisze 'koniec!'
        while (true) {
            System.out.print("Wpisz słowo: ");
            String input = scanner.nextLine();

            // Jezeli uzytkownik wpisal 'koniec!' - zakoncz dzialanie programu
            if (input.equals("koniec!")) {
                break;
            }

            // Jezeli uzytkownik wpisal inne slowo niz 'koniec!' - wypisz odpowiednik w jezyku angielskim
            if (dictionary.containsKey(input)) {
                System.out.println(dictionary.get(input));
            } else {
                System.out.println("Tłumaczenie nieznane.");
            }
        }
        scanner.close();
    }
}
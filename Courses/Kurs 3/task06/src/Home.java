import javafx.beans.binding.ObjectExpression;

import java.util.Objects;

/*Kurs Java od podstaw #6 - Klasy abstrakcyjne, interfejsy i metoda equals https://www.youtube.com/watch?v=xtelEWWixic&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=6*/
public class Home implements ChangeChannel, Change{
    public static void main(String[] args) {
        Nosy nosy = new Nosy();
        System.out.println(nosy.toString());
        System.out.println(nosy); // to to samo co wyzej

        String s1 = "tekst";
        String s2 = new String("tekst");
        if(s1 == s2)
        {
            System.out.println("s1==s2");
        }
        if(s1.equals(s2)) // pokazuje nam to, że inne wartości niż zmienne stałe porównuje sie equals
        {
            System.out.println("s1.equals(s2)");
        }

        if(nosy instanceof Object)
        {
            System.out.println("s1 instanceof Object");
        }

        if(s1 instanceof Object)
        {
            System.out.println("s1 instanceof Object");
        }
        TV.ChangeVolume();
    }

    @Override
    public void changeChannel() {

    }
}
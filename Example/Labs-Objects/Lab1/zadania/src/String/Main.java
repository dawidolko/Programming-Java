package String;

public class Main
{
    public static void main(String[] args)
    {
        String str1 = "Java", str2= "Java", str3="C#";
        String str4 = "Programowanie obiektowe - ";
        System.out.println(str1);
        System.out.println(str3);

        // Metody klasy String
        // length()
        System.out.println("Dlugosc tekstu: " + str1.length());
        // concat() - połączenie dwóch String
        System.out.println(str4.concat(str1));
        System.out.println(str1.concat(str2));
        // equals() - metoda porównywania ciągów znaków
        // Porównanie str1 i str2
        boolean result1 = str1.equals(str2);
        System.out.println("Porównanie str1 i str2: " + result1);
        // Porównanie str1 i str3
        boolean result2 = str1.equals(str3);
        System.out.println("Porównanie str1 i str3: " + result2);
    }
}

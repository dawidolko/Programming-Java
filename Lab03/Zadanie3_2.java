import java.util.Arrays;

public class Zadanie3_2 {
    public static void main(String[] args) {
        String str = "Ala ma kota";

        //toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("toCharArray(): " + Arrays.toString(charArray));

        //getBytes()
        byte[] byteArray = str.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(byteArray));

        //equals()
        String str2 = "Ala ma kota";
        System.out.println("equals(): " + str.equals(str2));

        //equalsIgnoreCase()
        String str3 = "ala MA KOTA";
        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(str3));

        //campareTo()
        System.out.println("campareTo(): " + str.compareTo(str2));

        //campareToIgnoreCase()
        System.out.println("campareToIgnoreCase(): " + str.compareToIgnoreCase(str3));

        //indexOf()
        System.out.println("indexOf(): " + str.indexOf('a'));

        //indexOf()
        System.out.println("indexOf(): " + str.indexOf("ma"));

        //lastIndexOf()
        System.out.println("lastIndexOf(): " + str.lastIndexOf('a'));

        //lastIndexOf()
        System.out.println("lastIndexOf(): " + str.lastIndexOf("ma"));

        //substring()
        System.out.println("substring(): " + str.substring(4));

        //substring()
        System.out.println("substring(): " + str.substring(4, 8));

        //replace()
        System.out.println("replace(): " + str.replace('a', 'o'));

        //trim()
        String str4 = "  Ala ma kota  ";
        System.out.println("trim(): [" + str4 + "]");
        System.out.println("trim(): [" + str4.trim() + "]");

        //toLowerCase()
        System.out.println("toLowerCase(): " + str.toLowerCase());

        //toUpperCase()
        System.out.println("toUpperCase(): " + str.toUpperCase());

        //split()
        String str5 = "Ala,ma,kota";
        System.out.println("split(): " + Arrays.toString(str5.split(",")));
        System.out.println("split(): " + Arrays.toString(str5.split(",", 1)));
    }
}
//        Metoda char[] toCharArray() zwraca tablicę znaków dla danego łańcucha znaków.
//        Metoda byte[] getBytes() zwraca tablicę bajtów zawierających bieżące znaki w postaci ich kodów ASCII.
//        Metoda boolean equals(String str) porównuje dwa łańcuchy znaków i zwraca wartość true, jeśli są one identyczne.
//        Metoda boolean equalsIgnoreCase(String str) działa tak samo jak equals(), ale ignoruje wielkość liter.
//        Metoda int campareTo(String str) porównuje dwa łańcuchy znaków i zwraca wartość ujemną, jeśli łańcuch, który jest argumentem, jest większy od łańcucha, który jest wywoływany; wartość 0, jeśli są one identyczne i wartość dodatnią, jeśli łańcuch, który jest argumentem, jest mniejszy od łańcucha, który jest wywoływany.
//        Metoda int campareToIgnoreCase(String str) działa tak samo jak campareTo(), ale ignoruje wielkość liter.
//        Metoda int indexOf(int i) zwraca indeks pierwszego wystąpienia danego znaku w łańcuchu lub -1, jeśli znak nie występuje w łańcuchu.
//        Metoda int indexOf(String str) zwraca indeks pierwszego wystąpienia danego łańcucha znaków w łańcuchu lub -1, jeśli łańcuch znaków nie występuje w łańcuchu.
//        Metoda int lastIndexOf(int i) zwraca indeks ostatniego wystąpienia danego znaku w łańcuchu lub -1, jeśli znak nie występuje w łańcuchu.
//        Metoda int lastIndexOf(String str) zwraca indeks ostatniego wystąpienia danego łańcucha znaków w łańcuchu lub -1, jeśli łańcuch znaków nie występuje w łańcuchu.
//        Metoda String substring(int startString) zwraca część łańcucha zaczynając od określonej pozycji do końca łańcucha.
//        Metoda String substring(int startString, int stopString) zwraca część łańcucha zaczynając od określonej pozycji do określonej pozycji.
//        Metoda String replace(char orginal, char zamiennik) zamienia wszystkie wystąpienia znaku orginal na znak zamiennik.
//        Metoda String trim() usuwa wszystkie białe znaki z początku i końca łańcucha.
//        Metoda String toLowerCase() zamienia wszystkie znaki w łańcuchu na małe litery.
//        Metoda String toUpperCase() zamienia wszystkie znaki w łańcuchu na wielkie litery.
//        Metoda String[] split(String regex, int limit) dzieli łańcuch na podłańcuchy według określonego wyrażenia regularnego i limitu podłańcuchów.
//        Metoda String[] split(String regex) dzieli łańcuch na podłańcuchy według określonego wyrażenia regularnego.
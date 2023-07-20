import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Kurs Java od podstaw #11 - Strumienie oraz kolekcje https://www.youtube.com/watch?v=uogs5cRttLs&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=11*/
public class Main {
    public static void main(String[] args) {
        System.out.println("text");
        //System.out.println(inputStreamTest());
        System.out.println(bufferedReaderTest());
        List<String> aList = new ArrayList<String>(32);
        List<String> lList = new LinkedList<String>();
        aList.add("Kotek");
        lList.add("Piesek");
        System.out.println(aList);
        System.out.println(lList);
    }

    public static String inputStreamTest() {
        System.out.println("Wprowadz dowolny znak z klawiatury: ");
        try {
            char c = (char) System.in.read();
            String str = c + "";
            return str;
        } catch (Exception e) {
            return "error";
        }
    }

    public static String bufferedReaderTest() // klasa z Exception <--
    {
        BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wyprowadz linie tekstu i nacisnij enter: ");
        try {
            return brIn.readLine();
        }catch (Exception e)
        {
            return "-1";
        }
    }

    public static void saveText(String text) {
        try {
            File file = new File("D:/text.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error");
        }
    }
}
import java.io.*;
public class Echo{
    public static void main(String args[]){
        byte b[] = new byte[100];
        try{
            System.in.read(b);
            System.out.write(b);
            System.out.flush();
        } catch (IOException ioe){
            System.out.println("Błąd wejścia-wyjścia");
        }
    }
}
import java.io.*;
public class PobierzDane{
    public static void main(String args[]){
        File f = new File("DANE1");
        if (f.mkdir()) {
            File g = new File (".");
            String s[] = g.list();
            for (int i =0; i<s.length; i++){
                System.out.println(s[i]);
            }
        } else {
            System.out.println("Błąd operacji I/O");
        }
    }
}
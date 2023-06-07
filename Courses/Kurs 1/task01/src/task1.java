import java.util.Scanner;

/* KURS 1 #1 - pierwszy program "HELLO WORLD!" https://www.youtube.com/watch?v=T3Pla6wZd4E&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=2*/
public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Podaj swoje Imię: ");
        name = scanner.next(); //.nextLine(); wczytuje pełną linię np. "DAWID OLKO"
        System.out.print("Hello World " + name); //kontagenacja
        //Można jak w jezyku C %s (printf)
    }
}

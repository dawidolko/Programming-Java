import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*Kurs Java od podstaw #12 - Java 8 https://www.youtube.com/watch?v=UcQTzbubCbg&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=12
 */
public class Main {

    public static void main (String args[])
    {
        for(int a=0;a<10;a++) {
            if(a%2==0) {
                System.out.println("Parzyste: "+a);
            }
        }

        IntStream.range(0, 10) // ważne ! ! ! to to, samo co wyzej.
                .filter(value -> value%2 ==0)
                .forEach(value -> System.out.println("Parzyste: "+value));


        List<Integer> intList = new ArrayList();
        int avgsum = 0;
        for(int a=0;a<10;a++) {
            if(a%2==1) {
                avgsum+=a;
                intList.add(a);
            }
        }
        double avg = avgsum/intList.size();
        System.out.println(avg);

        System.out.println(IntStream.iterate(1,f->f+2).limit(5).average().getAsDouble());

        /**
         () - parametry wywo³ania funkcji
         ->
         {} - treœæ wyra¿enia
         */
        // (a, b), (), (int a, int b)
        // () -> 33
        // (a) -> return a*a

        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button are pressed.");
            }
        });

        button.addActionListener((e -> {
            System.out.println("Button are pressed.");
        }));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for(Integer n : list)
        {
            System.out.println(n);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        list2.forEach(n-> System.out.println(n));

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        list3.forEach(System.out::println);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }

}
import Animal.Dog;

/*Kurs Java od podstaw #7 - Pakiety, klasy wewnętrzne, rzutowanie, rekurencja https://www.youtube.com/watch?v=j_7oRiVPKik&list=PLTs20Q-BTEMMJHb4GWFT34PAWxYyzndIY&index=7*/
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Outside outside = new Outside();

        int i = 35;
        double j = i;
        double a = 56.123;
        int b = (int)a; //<-- trzeba zrobic rzutowanie
        System.out.println(b);
        System.out.println(recursion(10));
        enums();
    }

    public static int recursion(int a)
    {
        if(a==0)
        {
            return 1;
        }else
        {
            return a*recursion (a-1);
        }
    }

    //EnumTest et = new EnumTest(); // <- tak nie można!
    public static void enums(){
        EnumTest large = EnumTest.LARGE;
        System.out.println(large.getSize(large));

    }
}
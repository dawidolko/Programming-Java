import java.util.SortedMap;

/*#31. Kurs Java dla początkujących - Equals vs == https://www.youtube.com/watch?v=N6iBId1EXbg&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=32*/
public class task31 {
    public static void main(String[] args)
    {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.name = "Tom";
        a2.name = "Tom";
        a2.age = 2;
        a1.age = 3;
        //a2 = a1; // <-- wtedy jest true

        System.out.println(a1 == a2); // false pomimo tego samego Stringa poniewaz porownywana jest referencja.
        System.out.println(a1.equals(a2)); //niejawne wywoływanie metody super dlatego nadal jest false

    }
}

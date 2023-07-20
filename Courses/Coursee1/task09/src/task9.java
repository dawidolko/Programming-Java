/*#9. Kurs Java dla początkujących - Tablice https://www.youtube.com/watch?v=H7IHjFckX5A&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=10
 */
public class task9 {
    public static void main(String[] args)
    {
        //String uczen1 = "Ania";
        //String uczen2 = "Bartek";
        String[] tab = new String[20];
        tab[0] = "Ania";
        tab[1] = "Bartek";
        tab[2] = "Adam";

        //System.out.println(tab.length); // bedzie 20 bo tyle zadeklarowaliśmy
        for(int i = 0; i < tab.length; i++)
        {
            System.out.println(tab[i]);
        }
        int[] tab1 = {1,2,3,4,5,6};
        for(int i = 0; i < tab1.length; i++)
        {
            System.out.println(tab1[i]);
        }
    }
}

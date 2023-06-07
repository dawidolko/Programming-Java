/*#32. Kurs Java dla początkujących - StringBuilder - optymalizacja https://www.youtube.com/watch?v=OsnZnKUfG44&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=33*/
public class task32 {
    public static void main(String[] args)
    {
        int j = 100000;
        String s = "";
        long start = System.currentTimeMillis();
        for(int i = 0; i < j; i++)
        {
            s += "a";
        }
        System.out.println(s);

        System.out.println("Czas: " + (System.currentTimeMillis() - start));

        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for(int i = 0; i < j; i++)
        {
            sb.append("a"); // dołącza na koncu stringa strcopy() lub memcpy() w jezyku C <---
        }
        System.out.println(sb.toString()); //toString poniewaz to jest zapisany string sb.append dynamicznie wiec bez tego sout by tego nie wyłapał
        System.out.format("Czas: %d " , (System.currentTimeMillis() - start)); //format przyspiesza %d tak jak w C

    }
}

/*#28. Kurs Java dla początkujących - Typ Enum https://www.youtube.com/watch?v=2hRZD_freMY&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=29*/
public class task28 {
    public static void main(String[] args)
    {
        Samochod bmw = new Samochod("BMW", Kolory.CZARNY);

        switch (bmw.kolor)
        {
            case BIALY:
                break;
            case CZARNY:
                break;
            case NIEBIESKI:
                break;
        }
    }
}

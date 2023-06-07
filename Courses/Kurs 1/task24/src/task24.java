/*#24. Kurs Java dla początkujących - Dziedziczenie cz. 1 https://www.youtube.com/watch?v=9xdzH5GE4bw&list=PL6aekdNhY7DCM1wGLQCE9eP3kPzu-P7E7&index=25*/
public class task24 { //dziedziczenie zachodzi tylko w jedną strone ! ! !
    public static void main(String[] args)
    {
        System.out.println("AUDI:");
        Samochod audi = new Samochod("audi", 4);
        //audi.iloscKol =  4;
        //audi.marka = "Audi";
        System.out.println(audi.iloscKol + " " + audi.marka);
        //audi.odpal();

        //audi.zamknijOtworz();
        System.out.println("SUBARU:");
        SamochodSportowy subaru = new SamochodSportowy("subaru", 2);
        //subaru.odpal();
        System.out.println("SUZUKI:");
        Motocykl suzuki = new Motocykl("suzuki", 0);
        //suzuki.marka = "Suzuki";
        //System.out.println(suzuki.iloscKol);
    }
}
